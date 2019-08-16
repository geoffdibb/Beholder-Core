package com.bae.service;

import org.springframework.stereotype.Service;

@Service
public interface CoreService {

	// Collection<Search> searchCollection();
	
	String getSearchByName();

	String getSearchByLocation();

	String getSearchByCarReg();

	String getLoggedInUser();

	String getAuditUserAccessLogs();
	
	String getSearchLogs();
	
	String sendSearchLog();
	
	String AuditUserAccessLogs();	
	
}
