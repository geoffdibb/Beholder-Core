package com.bae.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bae.entity.AuditRequestLog;
import com.bae.entity.AuditSearchLog;
import com.bae.entity.AuditUserAccessLog;

@Service
public class CoreServiceImpl implements CoreService {

	@Autowired
	private RestTemplate rest;

	@Autowired
	private JmsTemplate jmsTemplate;

	public String userLogin() {
		return rest.getForObject("http://UserAPI/username", String.class);
	}

	public String search(String category, String searchTerm) {
		return rest.getForObject("http://SearchAPI/" + category + "/" + searchTerm, String.class);
	}

	public String getProfile(long id) {
		return rest.getForObject("http://SearchAPI/profile" + id, String.class);
	}

	public String getAssociates(long id) {
		return rest.getForObject("http://IPAddressForSearchAPI/associates/forProfile" + id, String.class);
	}

	public String getAuditRequestLog() {
		return rest.getForObject("http://auditAPI/requestlogs/getAuditRequestLog", String.class);
	}

	public String getAuditUserAccessLog() {
		return rest.getForObject("http://AuditAPI/accesslogs/getAuditUserAccessLog", String.class);
	}

	public String getSearchLog() {
		return rest.getForObject("http://AuditAPI/searchlogs/getSearchLog", String.class);
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
