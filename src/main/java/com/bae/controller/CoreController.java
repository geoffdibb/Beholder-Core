package com.bae.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.service.CoreService;

@RestController
@RequestMapping("/core")
public class CoreController {

	@Autowired
	private CoreService service;

	@Autowired
	private JmsTemplate jmsTemplate;
	
	public CoreController(CoreService service, JmsTemplate jmsTemplate) {
		this.service = service;
		this.jmsTemplate = jmsTemplate;
	}
	
	public CoreController() {
	}
	
	@GetMapping("/userLogin/{username}")
	public ResponseEntity<Object> userLogin(@PathVariable Object user) {
		return new ResponseEntity<>(service.userLogin(user), HttpStatus.OK);
	}
	
	
	@RequestMapping("/logout")
	public String logout() {
		return null;
	}
	
	@RequestMapping("/getLoggedInUser")
	public String getLoggedInUser() {
		return null;
	}
	
	@RequestMapping("/getAuditUserAccessLogs")
	public String getAuditUserAccessLogs() {
		return null;
	}
	
	@RequestMapping("/getSearchLogs")
	public String getSearchLogs() {
		return null;
	}
	
	
	
}
