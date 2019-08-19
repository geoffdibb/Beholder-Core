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
@RequestMapping("/beholder")
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
	public ResponseEntity<Object> userLogin(@PathVariable String username) {
		return new ResponseEntity<>(service.userLogin(username), HttpStatus.OK);
	}

	@GetMapping("/search/{category}/{searchTerm}")
	public ResponseEntity<Object> search(@PathVariable String category, @PathVariable String searchTerm) {
		return new ResponseEntity<>(service.search(category, searchTerm), HttpStatus.OK);
	}

	@GetMapping("/profile")
	public ResponseEntity<Object> getProfile() {
		return new ResponseEntity<>(service.getProfile(), HttpStatus.OK);
	}

	@GetMapping("/associates/for{profile}")
	public ResponseEntity<Object> getAssociates(@PathVariable String profile) {
		return new ResponseEntity<>(service.getAssociates(profile), HttpStatus.OK);
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
	public ResponseEntity<Object> getSearchLog(Object object) {
		return new ResponseEntity<>(service.getSearchLog(object), HttpStatus.OK);
	}

}
