package com.bae.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
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

	private JmsMessagingTemplate messagingTemplate;

	@Captor
	private ArgumentCaptor<MessageCreator> messageCreator;

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

	@Before
	public void setup() {
		this.messagingTemplate = new JmsMessagingTemplate(this.jmsTemplate);
	}

	@Test
	public void validateJmsTemplate() {
		assertThat(this.messagingTemplate.getJmsTemplate()).isSameAs(this.jmsTemplate);
	}

	@Test
	public void contextLoads() {
		assertThat(service).isNotNull();
	}

	@Test
	public void userLoginTest() {
		Mockito.when(rest.getForObject(userLoginURL, String.class))
				.thenReturn(Constant.MOCK_USERLOGIN_OBJECT.toString());
		assertEquals(Constant.MOCK_USERLOGIN_OBJECT3, service.userLogin(Constant.MOCK_USER_OBJECT));
	}

	@Test
	public void searchTest() {
		Mockito.when(rest.getForObject(searchURL + Constant.MOCK_CATEGORY_OBJECT + "/" + Constant.MOCK_SEARCHTERM_OBJECT
				+ "/" + Constant.MOCK_USERNAME, String.class)).thenReturn(Constant.MOCK_SEARCH_OBJECT.toString());
		assertEquals(Constant.MOCK_SEARCH_OBJECT3,
				service.search(Constant.MOCK_CATEGORY_OBJECT, Constant.MOCK_SEARCHTERM_OBJECT, Constant.MOCK_USERNAME));
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
		assertEquals(Constant.MOCK_AUDITUSER_OBJECT3, service.getAuditUserAccessLog(Constant.MOCK_USERNAME));
	}

	@Test
	public void getSearchLog() {
		Mockito.when(rest.getForObject(auditSearchURL, String.class))
				.thenReturn(Constant.MOCK_SEARCH_OBJECT.toString());
		assertEquals(Constant.MOCK_SEARCH_OBJECT3, service.getSearchLog(Constant.MOCK_USERNAME));
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
