package com.bae.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CoreServiceImpl implements CoreService {

	@Autowired
	private RestTemplate rest;

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

	public String sendAuditUserAccessLogs(Object object) {
		return null;
	}

	public String sendAuditRequestLog() {
		return null;
	}

	public String sendSearchLog(Object object) {
		return null;
	}

}
