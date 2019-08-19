package com.bae.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CoreServiceImpl implements CoreService {
	
	@Autowired
	private RestTemplate rest;
	
	public String userLogin(String username) {
		return rest.getForObject("http://IPAddressForUserAPI/item/"+username, String.class);
		//This should return the message sent from UserAPI which shows if the user has logged in or not
	}
	
	public String search(String category, String searchTerm) {
		return rest.getForObject("http://IPAddressForSearchAPI/"+category+"/"+searchTerm, String.class);
		//This should return results for things that match the category and searchTerm inputed
		//The user should be able to choose a category of Name, Location or Car Registration
	}
	
	public String getProfile() {
		return rest.getForObject("http://IPAddressForSearchAPI/profile", String.class);
		//This should return a profile as an object
		//Using this object we can select what we want to display on the front end in react application
	}
	
	public String getAssociates(Object profile) {
		return rest.getForObject("http://IPAddressForSearchAPI/associates/for"+profile, String.class);
		//This should return an array of associate objects
		//we can then list this array in the react application
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
