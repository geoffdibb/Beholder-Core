package com.bae.util;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.bae.entity.AuditRequestLog;
import com.bae.entity.AuditSearchLog;
import com.bae.entity.AuditUserAccessLog;
import com.bae.entity.User;

public class Constant {

	public static final ResponseEntity<String> MOCK_USERLOGIN_OBJECT = new ResponseEntity<String>("userLogin",
			HttpStatus.OK);
	public static final String MOCK_USERLOGIN_OBJECT2 = "userLogin";
	public static final String MOCK_USERLOGIN_OBJECT3 = null;

	public static final ResponseEntity<String> MOCK_SEARCH_OBJECT = new ResponseEntity<String>("search", HttpStatus.OK);
	public static final String MOCK_SEARCH_OBJECT2 = "search";
	public static final String MOCK_SEARCH_OBJECT3 = null;

	public static final ResponseEntity<String> MOCK_PROFILE_OBJECT = new ResponseEntity<String>("profile",
			HttpStatus.OK);
	public static final String MOCK_PROFILE_OBJECT2 = "profile";
	public static final String MOCK_PROFILE_OBJECT3 = null;

	public static final ResponseEntity<String> MOCK_AUDIT_OBJECT = new ResponseEntity<String>("audit", HttpStatus.OK);
	public static final String MOCK_AUDIT_OBJECT2 = "audit";
	public static final String MOCK_AUDIT_OBJECT3 = null;

	public static final AuditRequestLog MOCK_AUDITLOG_OBJECT = new AuditRequestLog("name");
	public static final AuditRequestLog MOCK_AUDITLOG_OBJECT2 = new AuditRequestLog("name");
	public static final String MOCK_AUDITLOG_OBJECT3 = null;

	public static final AuditSearchLog MOCK_AUDITSEARCH_OBJECT = new AuditSearchLog("name", "category", "search");
	public static final AuditSearchLog MOCK_AUDITSEARCH_OBJECT2 = new AuditSearchLog("name", "category", "search");
	public static final String MOCK_AUDITSEARCH_OBJECT3 = null;

	public static final AuditUserAccessLog MOCK_AUDITUSER_OBJECT = new AuditUserAccessLog("name");
	public static final AuditUserAccessLog MOCK_AUDITUSER_OBJECT2 = new AuditUserAccessLog("name");
	public static final String MOCK_AUDITUSER_OBJECT3 = null;
	public static final String MOCK_AUDITUSER_OBJECT4 = "Audit user logs sent";
	public static final String MOCK_USERNAME_OBJECT = "user1";

	public static final Date MOCK_TIME_OBJECT = new Date();

	public static final String MOCK_CATEGORY_OBJECT = "category";
	public static final String MOCK_SEARCHTERM_OBJECT = "searchTerm";
	public static final String MOCK_RETURNMESSAGE_OBJECT = "log sent";
	public static final long MOCK_ID_OBJECT = 1;

	public static final User MOCK_USER_OBJECT = new User("name", (long) 1, "password");
	public static final User MOCK_USER_OBJECT2 = new User("name", (long) 1, "password");
	
}
