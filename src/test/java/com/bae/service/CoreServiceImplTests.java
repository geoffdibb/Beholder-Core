package com.bae.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.bae.util.Constant;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoreServiceImplTests {

	@InjectMocks
	CoreServiceImpl service;

	@Mock
	RestTemplate rest;

	@Mock
	JmsTemplate jmsTemplate;

	@Value("${url.user}")
	private String userLoginURL;

	@Value("${url.search}")
	private String searchURL;

	@Value("${url.searchProfile}")
	private String searchProfileURL;

	@Value("${url.searchAssociates}")
	private String searchAssociatesURL;

	@Value("${url.AuditRequest}")
	private String auditRequestURL;

	@Value("${url.AuditUser}")
	private String auditUserURL;

	@Value("${url.AuditSearch}")
	private String auditSearchURL;

	@Test
	public void contextLoads() {
		assertThat(service).isNotNull();
	}

	@Test
	public void userLoginTest() {
		Mockito.when(rest.getForObject(userLoginURL, String.class))
				.thenReturn(Constant.MOCK_USERLOGIN_OBJECT.toString());
		assertEquals(Constant.MOCK_USERLOGIN_OBJECT3, service.userLogin());
	}

	@Test
	public void searchTest() {
		Mockito.when(rest.getForObject(
				searchURL + Constant.MOCK_CATEGORY_OBJECT + "/" + Constant.MOCK_SEARCHTERM_OBJECT, String.class))
				.thenReturn(Constant.MOCK_SEARCH_OBJECT.toString());
		assertEquals(Constant.MOCK_SEARCH_OBJECT3,
				service.search(Constant.MOCK_CATEGORY_OBJECT, Constant.MOCK_SEARCHTERM_OBJECT));
	}

	@Test
	public void getProfileTest() {
		Mockito.when(rest.getForObject(searchProfileURL + Constant.MOCK_ID_OBJECT, String.class))
				.thenReturn(Constant.MOCK_PROFILE_OBJECT.toString());
		assertEquals(Constant.MOCK_PROFILE_OBJECT3, service.getProfile(1));
	}

	@Test
	public void getAssociates() {
		Mockito.when(rest.getForObject(searchAssociatesURL + Constant.MOCK_ID_OBJECT, String.class))
				.thenReturn(Constant.MOCK_PROFILE_OBJECT.toString());
		assertEquals(Constant.MOCK_PROFILE_OBJECT3, service.getAssociates(1));
	}

	@Test
	public void getAuditRequestLogTest() {
		Mockito.when(rest.getForObject(auditRequestURL, String.class))
				.thenReturn(Constant.MOCK_AUDIT_OBJECT.toString());
		assertEquals(Constant.MOCK_AUDIT_OBJECT3, service.getAuditRequestLog());
	}

	@Test
	public void getAuditUserAccessLogTest() {
		Mockito.when(rest.getForObject(auditUserURL, String.class))
				.thenReturn(Constant.MOCK_AUDITUSER_OBJECT.toString());
		assertEquals(Constant.MOCK_AUDITUSER_OBJECT3, service.getAuditUserAccessLog());
	}

	@Test
	public void getSearchLog() {
		Mockito.when(rest.getForObject(auditSearchURL, String.class))
				.thenReturn(Constant.MOCK_SEARCH_OBJECT.toString());
		assertEquals(Constant.MOCK_SEARCH_OBJECT3, service.getSearchLog());
	}

	@Test
	public void sendAuditUserAccessLogs() {
//		Mockito.when(jmsTemplate.convertAndSend("SearchLogQueue", Constant.MOCK_AUDITLOG_OBJECT))
//				.thenReturn(Constant.MOCK_AUDITLOG_OBJECT.toString());
//		assertEquals(Constant.MOCK_AUDITLOG_OBJECT, service.sendAuditUserAccessLogs("name", 1));
	}

	@Test
	public void sendAuditRequestLogTest() {

	}

	@Test
	public void sendSearchLogTest() {

	}

	@Test
	public void getRestTemplateTest() {
		assertEquals(rest, service.getRest());
	}

	@Test
	public void setRestTemplateTest() {
		service.setRest(rest);
		assertEquals(rest, service.getRest());
	}

	@Test
	public void getJmsTemplateTest() {
		assertEquals(jmsTemplate, service.getJmsTemplate());
	}

	@Test
	public void setJmsTemplateTest() {
		service.setJmsTemplate(jmsTemplate);
		assertEquals(jmsTemplate, service.getJmsTemplate());
	}

}
