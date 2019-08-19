package com.bae.service;

import org.springframework.stereotype.Service;

import com.bae.entity.AuditRequestLog;
import com.bae.entity.AuditSearchLog;
import com.bae.entity.AuditUserAccessLog;

@Service
public interface CoreService {

	String userLogin();

	String search(String category, String searchTerm);

	String getProfile(long id);

	String getAssociates(long id);

	String getAuditRequestLog();

	String getAuditUserAccessLog();

	String getSearchLog();

	void sendAuditRequestLog(String username, long id);

	void sendAuditUserAccessLogs(String username, long id);

	void sendSearchLog(String username, Long id, String searchTerm);
}
