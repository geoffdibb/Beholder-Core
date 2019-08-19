package com.bae.service;

import org.springframework.stereotype.Service;

@Service
public interface CoreService {

	// Collection<Search> searchCollection();
	
	String userLogin(String username);
	
	String search(String category, String searchTerm);
	
	String getProfile();
	
	String getAssociates(Object profile);
	
	String getAuditRequestLog();
	
	String getAuditUserAccessLog();
	
	String getSearchLog(Object object);
	
	String sendAuditRequestLog();
	
	String sendAuditUserAccessLogs(Object object);	
	
	String sendSearchLog(Object object);
}
