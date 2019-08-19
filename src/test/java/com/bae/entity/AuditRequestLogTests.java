package com.bae.entity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuditRequestLogTests {

	AuditRequestLog account = new AuditRequestLog("name", 1L, null);

	@Test
	public void getUsernameTest() {
		assertEquals("name", account.getUsername());
	}

	@Test
	public void setUsernameTest() {
		account.setUsername("new name");
		assertEquals("new name", account.getUsername());
	}

	@Test
	public void getIdTest() {
		assertEquals(1L, account.getId());
	}

	@Test
	public void setIdTest() {
		account.setId(2L);
		assertEquals(2L, account.getId());
	}

	@Test
	public void getTimeStampTest() {
		assertEquals(null, account.getTimeStamp());
	}

	@Test
	public void setTimeStampTest() {
		account.setTimeStamp(null);
		assertEquals(null, account.getTimeStamp());
	}
}
