package com.bae.entity;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuditRequestLogTests {

	AuditRequestLog account = new AuditRequestLog("name", (long) 1);

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
		assertEquals((long) 1, account.getId());
	}

	@Test
	public void setIdTest() {
		account.setId((long) 2);
		assertEquals((long) 2, account.getId());
	}

	@Ignore
	@Test
	public void getTimeStampTest() {
		assertEquals(null, account.getTimeStamp());
	}

	@Ignore
	@Test
	public void setTimeStampTest() {
		account.setTimeStamp(null);
		assertEquals(null, account.getTimeStamp());
	}
}
