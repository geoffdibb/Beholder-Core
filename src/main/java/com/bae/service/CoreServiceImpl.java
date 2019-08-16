package com.bae.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CoreServiceImpl implements CoreService {
	
	@Autowired
	private RestTemplate rest;

	public String getSearchByName() {
		String searchResult = rest.getForObject("http://", String.class);
		return null;
	}

	public String getSearchByLocation() {
		String searchResult = rest.getForObject("http://", String.class);
		return null;
	}


	public String getSearchByCarReg() {
		String searchResult = rest.getForObject("http://", String.class);
		return null;
	}

	public String getLoggedInUser() {
		String user = rest.getForObject("http://", String.class);
		return null;
	}

	public String getAuditUserAccessLogs() {
		String auditLogs = rest.getForObject("http://", String.class);
		return null;
	}

	public String getSearchLogs() {
		String searchLogs = rest.getForObject("http://", String.class);
		return null;
	}

	public String sendSearchLog() {
		// TODO Auto-generated method stub
		return null;
	}

	public String sendAuditUserAccessLogs() {
		String auditLogs = rest.getForObject("http://", String.class);
		return null;
	}

}
