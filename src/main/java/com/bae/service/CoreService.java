package com.bae.service;

import org.springframework.stereotype.Service;

@Service
public interface CoreService {

	// Collection<Search> searchCollection();
	
	String userLogin();
	
	String search(String category, String searchTerm);
	
	String getProfile(long id);
	
	String getAssociates(long id);
	
	
	String getAuditRequestLog();
	
	String getAuditUserAccessLog();
	
	String getSearchLog();
	
	
	String sendAuditRequestLog();
	
	String sendAuditUserAccessLogs(Object object);	
	
	String sendSearchLog(Object object);
}
