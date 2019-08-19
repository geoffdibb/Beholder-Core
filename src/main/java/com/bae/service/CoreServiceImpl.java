package com.bae.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CoreServiceImpl implements CoreService {

	@Autowired
	private RestTemplate rest;

	public String userLogin() {
		return rest.getForObject("http://IPAddressForUserAPI/username", String.class);
	}

	public String search(String category, String searchTerm) {
		return rest.getForObject("http://IPAddressForSearchAPI/" + category + "/" + searchTerm, String.class);
	}

	public String getProfile() {
		return rest.getForObject("http://IPAddressForSearchAPI/profile", String.class);
	}

	public String getAssociates(Object profile) {
		return rest.getForObject("http://IPAddressForSearchAPI/associates/for" + profile, String.class);
	}

	public String getAuditRequestLog() {
		String auditLog = rest.getForObject("http://", String.class);
		return null;
	}

	public String getAuditUserAccessLog() {
		String searchLogs = rest.getForObject("http://", String.class);
		return null;
	}

	public String getSearchLog(Object object) {
		String addUserRequest = rest.postForObject("http://", object, String.class);
		return null;
	}

	public String sendAuditUserAccessLogs(Object object) {
		String addUserRequest = rest.postForObject("http://", object, String.class);
		return null;
	}

	public String sendAuditRequestLog() {
		// TODO Auto-generated method stub
		return null;
	}

	public String sendSearchLog(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

}
