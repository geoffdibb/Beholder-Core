package com.bae.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bae.entity.AuditRequestLog;
import com.bae.entity.AuditSearchLog;
import com.bae.entity.AuditUserAccessLog;
import com.bae.entity.User;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class CoreServiceImpl implements CoreService {

	private RestTemplate rest;

	private JmsTemplate jmsTemplate;

//	@Value("${url.user}")
//	private String userLoginURL;

	@Value("${url.search}")
	private String searchURL;

	@Value("${url.searchProfile}")
	private String searchProfileURL;

	@Value("${url.searchAssociates}")
	private String searchAssociatesURL;

	@Value("${url.AuditRequest}")
	private String auditRequestURL;

	@Value("${url.AuditUser}")
	private String auditUserURL;

	@Value("${url.AuditSearch}")
	private String auditSearchURL;

	@Autowired
	public CoreServiceImpl(RestTemplate rest, JmsTemplate jmsTemplate) {
		this.rest = rest;
		this.jmsTemplate = jmsTemplate;
	}

	public String userLogin(Object user) {
		ObjectMapper mapper = new ObjectMapper();
		User userToSend = mapper.convertValue(user, User.class);
		sendAuditUserAccessLogs(userToSend.getUsername());
		return "log sent";
	}

	public String search(String username, String category, String searchTerm) {
		sendSearchLog(username, category, searchTerm);
		return rest.getForObject(searchURL + category + "/" + searchTerm, String.class);
	}

	public String getProfile(long id) {
		return rest.getForObject(searchProfileURL + id, String.class);
	}

	public String getAssociates(long id) {
		return rest.getForObject(searchAssociatesURL + id, String.class);
	}

	public String getAuditRequestLog() {
		return rest.getForObject(auditRequestURL, String.class);
	}

	public String getAuditUserAccessLog(String username) {
		sendAuditRequestLog(username);
		return rest.getForObject(auditUserURL, String.class);
	}

	public String getSearchLog(String username) {
		sendAuditRequestLog(username);
		return rest.getForObject(auditSearchURL, String.class);
	}

	public String sendAuditUserAccessLogs(String username) {
		AuditUserAccessLog auditUser = new AuditUserAccessLog(username);
		jmsTemplate.convertAndSend("AuditUserAccessQueue", auditUser);
		return "Audit user logs sent";
	}

	public String sendAuditRequestLog(String username) {
		AuditRequestLog audit = new AuditRequestLog(username);
		jmsTemplate.convertAndSend("AuditRequestQueue", audit);
		return "Audit request logs sent";
	}

	public String sendSearchLog(String username, String category, String searchTerm) {
		AuditSearchLog searchLog = new AuditSearchLog(username, category, searchTerm);
		jmsTemplate.convertAndSend("SearchLogQueue", searchLog);
		return "Audit search logs sent";
	}

	public RestTemplate getRest() {
		return rest;
	}

	public void setRest(RestTemplate rest) {
		this.rest = rest;
	}

	public JmsTemplate getJmsTemplate() {
		return jmsTemplate;
	}

	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

}
