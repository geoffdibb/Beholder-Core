package com.bae.entity;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuditSearchLogTest {


	AuditSearchLog audit = new AuditSearchLog("name", (long) 1, "search");

	@Test
	public void getUsernameTest() {
		assertEquals("name", audit.getUsername());
	}

	@Test
	public void setUsernameTest() {
		audit.setUsername("new name");
		assertEquals("new name", audit.getUsername());
	}

	@Test
	public void getIdTest() {
		assertEquals((long) 1, audit.getId());
	}

	@Test
	public void setIdTest() {
		audit.setId((long) 2);
		assertEquals((long) 2, audit.getId());
	}

	@Ignore
	@Test
	public void getTimeStampTest() {
		assertEquals(null, audit.getTimeStamp());
	}

	@Ignore
	@Test
	public void setTimeStampTest() {
		audit.setTimeStamp(null);
		assertEquals(null, audit.getTimeStamp());
	}
	
	@Test
	public void getSearchTermTest() {
		assertEquals("search", audit.getSearchTerm());
	}
	
	@Test
	public void setSearchTermTest() {
		audit.setSearchTerm("search2");
		assertEquals("search2", audit.getSearchTerm());
	}
}
