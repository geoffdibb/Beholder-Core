package com.bae.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
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
	
	public String logout() {
		return null;
	}
	
	public String login() {
		return null;
	}
	
	public String getLoggedInUser() {
		return null;
	}
	
	public String getAuditUserAccessLogs() {
		return null;
	}
	
	public String getSearchLogs() {
		return null;
	}
	
}
