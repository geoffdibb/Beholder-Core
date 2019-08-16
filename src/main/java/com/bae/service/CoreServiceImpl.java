package com.bae.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CoreServiceImpl implements CoreService {
	
	@Autowired
	private RestTemplate rest;
	
	public String userLogin(Object user) {
		return rest.getForObject("http://IPAddressForUserAPI/item/username", String.class);
	}
	
	public String search(String category, String searchTerm) {
		return rest.getForObject("http://IPAddressForSearchAPI/"+category+"/"+searchTerm, String.class);
	}
	
	public String getProfile() {
		return null;
	}
	
	public String getAssociates() {
		return null;
	}
	
	

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

	public String getAuditUserAccessLogs() {
		String auditLogs = rest.getForObject("http://", String.class);
		return null;
	}

	public String getSearchLogs() {
		String searchLogs = rest.getForObject("http://", String.class);
		return null;
	}

	public String sendSearchLog(Object object) {
		String addUserRequest = rest.postForObject("http://localhost:8081/user/addUser/", object, String.class);
		return null;
	}

	public String sendAuditUserAccessLogs(Object object) {
		String addUserRequest = rest.postForObject("http://localhost:8081/user/addUser/", object, String.class);
		return null;
	}

}
