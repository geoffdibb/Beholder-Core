package com.bae.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoreServiceImplTests {

	@InjectMocks
	CoreServiceImpl service;
	
	@Mock
	RestTemplate restTemplate;

	@Mock
	JmsTemplate jmsTemplate;

	@Test
	public void contextLoads() {
		assertThat(service).isNotNull();
	}

	@Test
	public void userLoginTest() {

	}

	@Test
	public void searchTest() {

	}

	@Test
	public void getProfileTest() {

	}

	@Test
	public void getAssociates() {

	}
	
	@Test
	public void getAuditRequestLogTest() {
		
	}
	
	@Test
	public void getAuditUserAccessLogTest() {
		
	}
	
	@Test
	public void getSearchLog() {
		
	}
	
	@Test
	public void sendAuditUserAccessLogs() {
		
	}
	
	@Test
	public void sendAuditRequestLogTest() {
		
	}
	
	@Test
	public void sendSearchLogTest() {
		
	}
	
	
}
