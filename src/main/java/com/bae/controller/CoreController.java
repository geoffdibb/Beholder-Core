package com.bae.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.service.CoreService;

@RestController
@RequestMapping("${path.controller=/beholder}")
public class CoreController {

	private CoreService service;

	private JmsTemplate jmsTemplate;

	@Value("${path.userLogin}")
	private String userLoginURL;
	
	@Value("${path.search}")
	private String searchURL;
	
	@Value("${path.profile}")
	private String profileURL;
	
	@Value("${path.associates}")
	private String associatesURL;
	
	@Value("${path.getAuditRequestLog}")
	private String getAuditRequestLogURL;
	
	@Value("${path.getAuditUserAccessLog}")
	private String getAuditUserAccessLogURL;
	
	@Value("${path.getSearchLog}")
	private String getSearchLogURL;

	@Autowired
	public CoreController(CoreService service, JmsTemplate jmsTemplate) {
		this.service = service;
		this.jmsTemplate = jmsTemplate;
	}

	@PostMapping("userLoginURL")
	public ResponseEntity<Object> userLogin(@RequestBody Object user) {
		return new ResponseEntity<>(service.userLogin(user), HttpStatus.OK);
	}

	@GetMapping("searchURL")
	public ResponseEntity<Object> search(@PathVariable String category, @PathVariable String searchTerm) {
		return new ResponseEntity<>(service.search(category, searchTerm), HttpStatus.OK);
	}

	@GetMapping("profileURL")
	public ResponseEntity<Object> getProfile(@PathVariable long id) {
		return new ResponseEntity<>(service.getProfile(id), HttpStatus.OK);
	}

	@GetMapping("associatesURL")
	public ResponseEntity<Object> getAssociates(@PathVariable long id) {
		return new ResponseEntity<>(service.getAssociates(id), HttpStatus.OK);
	}

	@GetMapping("getAuditRequestLogURL")
	public ResponseEntity<Object> getAuditRequestLog() {
		return new ResponseEntity<>(service.getAuditRequestLog(), HttpStatus.OK);
	}

	@GetMapping("getAuditUserAccessLogURL")
	public ResponseEntity<Object> getAuditUserAccessLog() {
		return new ResponseEntity<>(service.getAuditUserAccessLog(), HttpStatus.OK);
	}

	@GetMapping("getSearchLogURL")
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
