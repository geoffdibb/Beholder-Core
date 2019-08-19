package com.bae.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.service.CoreService;

@RestController
@RequestMapping("/beholder")
public class CoreController {

	private CoreService service;

	private JmsTemplate jmsTemplate;

	@Autowired
	public CoreController(CoreService service, JmsTemplate jmsTemplate) {
		this.service = service;
		this.jmsTemplate = jmsTemplate;
	}

	@PostMapping("/userLogin")
	public ResponseEntity<Object> userLogin() {
		return new ResponseEntity<>(service.userLogin(), HttpStatus.OK);
	}

	@GetMapping("/search/{category}/{searchTerm}")
	public ResponseEntity<Object> search(@PathVariable String category, @PathVariable String searchTerm) {
		return new ResponseEntity<>(service.search(category, searchTerm), HttpStatus.OK);
	}

	@GetMapping("/profile/{id}")
	public ResponseEntity<Object> getProfile(@PathVariable long id) {
		return new ResponseEntity<>(service.getProfile(id), HttpStatus.OK);
	}

	@GetMapping("/associates/forProfile{id}")
	public ResponseEntity<Object> getAssociates(@PathVariable long id) {
		return new ResponseEntity<>(service.getAssociates(id), HttpStatus.OK);
	}

	@RequestMapping("/getAuditRequestLog")
	public ResponseEntity<Object> getAuditRequestLog() {
		return new ResponseEntity<>(service.getAuditRequestLog(), HttpStatus.OK);
	}

	@RequestMapping("/getAuditUserAccessLog")
	public ResponseEntity<Object> getAuditUserAccessLog() {
		return new ResponseEntity<>(service.getAuditUserAccessLog(), HttpStatus.OK);
	}

	@RequestMapping("/getSearchLog")
	public ResponseEntity<Object> getSearchLog() {
		return new ResponseEntity<>(service.getSearchLog(), HttpStatus.OK);
	}

	public CoreService getService() {
		return service;
	}

	public void setService(CoreService service) {
		this.service = service;
	}

	public JmsTemplate getJmsTemplate() {
		return jmsTemplate;
	}

	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}
	
	

}
