package com.bae.service;

import org.springframework.stereotype.Service;

@Service
public interface CoreService {

	// Collection<Search> searchCollection();
	
	String userLogin(Object user);
	
	String search(String category, String searchTerm);
	
	String getProfile();
	
	String getAssociates(Object profile);
	
	
	
	

	String getAuditUserAccessLogs();
	
	String getSearchLogs();
	
	String sendSearchLog(Object object);
	
	String sendAuditUserAccessLogs(Object object);	
	
}
