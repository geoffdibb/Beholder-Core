package com.bae.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoreServiceImplTests {

	@InjectMocks
	CoreServiceImpl service;

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
