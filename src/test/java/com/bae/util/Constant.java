package com.bae.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class Constant {

//	public static final AuditRequestLog MOCK_AUDITREQUESTLOG_OBJECT = new AuditRequestLog("audit", 1);
//	public static final AuditRequestLog MOCK_AUDITREQUESTLOG_OBJECT2 = new AuditRequestLog("audit", 2);
//	public static final Optional<AuditRequestLog> MOCK_AUDITREQUESTLOG_OBJECT3 = Optional.of(MOCK_AUDITREQUESTLOG_OBJECT);
	
	
	public static final ResponseEntity<String> MOCK_PROFILE_OBJECT = new ResponseEntity<String>("profile", HttpStatus.OK);
	public static final String MOCK_PROFILE_OBJECT2 = "profile";
}
