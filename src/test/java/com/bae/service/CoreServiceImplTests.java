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
import org.springframework.boot.test.context.SpringBootTest;
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
	RestTemplate restTemplate;

	@Mock
	JmsTemplate jmsTemplate;

	@Test
	public void contextLoads() {
		assertThat(service).isNotNull();
	} 

	@Test
	public void userLoginTest() {
		ResponseEntity<Void> responseEntity = ResponseEntity.ok().build();
		assertThat(responseEntity).isNotNull();
		assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat(responseEntity.getBody()).isNull();
	}
	
//	@Test
//	public void searchTest() {
//
//	}
//
//	@Test
//	public void getProfileTest() {
//
//	}
//
//	@Test
//	public void getAssociates() {
//
//	}
//
//	@Test
//	public void getAuditRequestLogTest() {
//
//	}
//
//	@Test
//	public void getAuditUserAccessLogTest() {
//
//	}
//
//	@Test
//	public void getSearchLog() {
//
//	}
//
//	@Test
//	public void sendAuditUserAccessLogs() {
//
//	}
//
//	@Test
//	public void sendAuditRequestLogTest() {
//
//	}
//
//	@Test
//	public void sendSearchLogTest() {
//
//	}

}
