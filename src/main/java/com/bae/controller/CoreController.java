package com.bae.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.service.CoreService;
import com.bae.util.SecurityUtils;

@RestController
@RequestMapping("${path.controller}")
public class CoreController {

	private CoreService service;

	private JmsTemplate jmsTemplate;

	@Autowired
	public CoreController(CoreService service, JmsTemplate jmsTemplate) {
		this.service = service;
		this.jmsTemplate = jmsTemplate;
	}

	@PostMapping("${path.userLogin}")
	public ResponseEntity<Object> userLogin(@RequestBody Object user) {
		return new ResponseEntity<>(service.userLogin(user), HttpStatus.OK);
	}

	@GetMapping("${path.search}")
	public ResponseEntity<Object> search(@PathVariable String category, @PathVariable String searchTerm) {
		return new ResponseEntity<>(service.search(category, searchTerm), HttpStatus.OK);
	}

	@GetMapping("${path.profile}")
	public ResponseEntity<Object> getProfile(@PathVariable long id) {
		return new ResponseEntity<>(service.getProfile(id), HttpStatus.OK);
	}

	@GetMapping("${path.associates}")
	public ResponseEntity<Object> getAssociates(@PathVariable long id) {
		return new ResponseEntity<>(service.getAssociates(id), HttpStatus.OK);
	}

	@GetMapping("${path.getAuditRequestLog}")
	public ResponseEntity<Object> getAuditRequestLog() {
		return new ResponseEntity<>(service.getAuditRequestLog(), HttpStatus.OK);
	}

	@GetMapping("${path.getAuditUserAccessLog}")
	public ResponseEntity<Object> getAuditUserAccessLog() {
		return new ResponseEntity<>(service.getAuditUserAccessLog(), HttpStatus.OK);
	}

	@GetMapping("${path.getSearchLog}")
	public ResponseEntity<Object> getSearchLog() {
		return new ResponseEntity<>(service.getSearchLog(), HttpStatus.OK);
	}

	@GetMapping(path = "/username")
	@PreAuthorize("hasAnyAuthority('ROLE_USER')")
	public ResponseEntity<String> getAuthorizedUserName() {
		return ResponseEntity.ok(SecurityUtils.getUser());
	}

//	@GetMapping(path = "/roles")
//	@PreAuthorize("hasAnyAuthority('ROLE_USER')")
//	public ResponseEntity<Set<String>> getAuthorizedUserRoles() {
//		return ResponseEntity.ok(SecurityUtils.getUserRoles());
//	}

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
