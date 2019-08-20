package com.bae.util;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.bae.entity.AuditRequestLog;

public class Constant {

	public static final AuditRequestLog MOCK_USER_OBJECT = new AuditRequestLog("audit", 1);
	public static final AuditRequestLog MOCK_USER_OBJECT2 = new AuditRequestLog("audit", 2);
	public static final Optional<AuditRequestLog> MOCK_USER_OBJECT3 = Optional.of(MOCK_USER_OBJECT);
	public static final ResponseEntity<String> MOCK_USER_OBJECT4 = new ResponseEntity<String>("search", HttpStatus.OK);

}
