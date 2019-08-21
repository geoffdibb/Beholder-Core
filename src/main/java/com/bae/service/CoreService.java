package com.bae.service;

import org.springframework.stereotype.Service;

@Service
public interface CoreService {

	String userLogin(Object user);

	String search(String username, String category, String searchTerm);

	String getProfile(long id);

	String getAssociates(long id);

	String getAuditRequestLog();

	String getAuditUserAccessLog(String username);

	String getSearchLog(String username);

	String sendAuditRequestLog(String username);

	String sendAuditUserAccessLogs(String username, long id);

	String sendSearchLog(String username, String category, String searchTerm);
}
