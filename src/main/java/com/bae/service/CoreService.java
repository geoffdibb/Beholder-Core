package com.bae.service;

import org.springframework.stereotype.Service;

@Service
public interface CoreService {

	String userLogin(Object user);

	String search(String category, String searchTerm);

	String getProfile(long id);

	String getAssociates(long id);

	String getAuditRequestLog();

	String getAuditUserAccessLog();

	String getSearchLog();

	String sendAuditRequestLog(String username, long id);

	String sendAuditUserAccessLogs(String username, long id);

	String sendSearchLog(String username, Long id, String searchTerm);
}
