package com.bae.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bae.entity.AuditRequestLog;
import com.bae.entity.AuditSearchLog;
import com.bae.entity.AuditUserAccessLog;

@Service
public class CoreServiceImpl implements CoreService {

	private RestTemplate rest;

	private JmsTemplate jmsTemplate;

	@Value("${url.user}")
	private String userLoginURL;

	@Value("${url.search}")
	private String searchURL;

	@Value("${url.searchProfile}")
	private String searchProfileURL;

	@Value("${url.searchAssociates}")
	private String searchAssociatesURL;

	@Value("${url.AuditRequest}")
	private String AuditRequestURL;

	@Value("${url.AuditUser}")
	private String AuditUserURL;
	
	@Value("${url.AuditSearch}")
	private String AuditSearchURL;

//	url.search=http://SearchAPI:8082/
//		url.searchProfile=http://Search:8082/profile
//		url.searchAssociates=http://Search:8082/associates/forProfile
//		url.AuditRequest=http://AuditAPI:8081/requestLogs/getAuditRequestLog
//		url.AuditUser=http://AuditAPI:8081/accessLogs/getAuditUserAccessLog
//		url.AuditSearch=http://AuditAPI:8081/searchLogs/getSearchLogs

	@Autowired
	public CoreServiceImpl(RestTemplate rest, JmsTemplate jmsTemplate) {
		this.rest = rest;
		this.jmsTemplate = jmsTemplate;
	}

	public String userLogin() {
		return rest.getForObject(userLoginURL, String.class);
	}

	public String search(String category, String searchTerm) {
		return rest.getForObject(searchURL + category + "/" + searchTerm, String.class);
	}

	public String getProfile(long id) {
		return rest.getForObject(searchProfileURL + id, String.class);
	}

	public String getAssociates(long id) {
		return rest.getForObject(searchAssociatesURL + id, String.class);
	}

	public String getAuditRequestLog() {
		return rest.getForObject(AuditRequestURL, String.class);
	}

	public String getAuditUserAccessLog() {
		return rest.getForObject(AuditUserURL, String.class);
	}

	public String getSearchLog() {
		return rest.getForObject(AuditSearchURL, String.class);
	}

	public void sendAuditUserAccessLogs(String username, long id) {
		AuditUserAccessLog auditUser = new AuditUserAccessLog(username, id);
		jmsTemplate.convertAndSend("AuditUserAccessQueue", auditUser);
	}

	public void sendAuditRequestLog(String username, long id) {
		AuditRequestLog audit = new AuditRequestLog(username, id);
		jmsTemplate.convertAndSend("AuditRequestQueue", audit);
	}

	public void sendSearchLog(String username, Long id, String searchTerm) {
		AuditSearchLog searchLog = new AuditSearchLog(username, id, searchTerm);
		jmsTemplate.convertAndSend("SearchLogQueue", searchLog);
	}

}
