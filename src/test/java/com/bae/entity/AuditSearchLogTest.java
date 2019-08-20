package com.bae.entity;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.util.Constant;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuditSearchLogTest {


	AuditSearchLog auditSearch = new AuditSearchLog("name", (long) 1, "search");
	
	Date time = new Date();

	@Test
	public void getUsernameTest() {
		assertEquals("name", Constant.auditSearch.getUsername());
	}

	@Test
	public void setUsernameTest() {
		Constant.auditSearch.setUsername("new name");
		assertEquals("new name", Constant.auditSearch.getUsername());
	}

	@Test
	public void getIdTest() {
		assertEquals((long) 1, Constant.auditSearch.getId());
	}

//	@Test
//	public void setIdTest() {
//		Constant.auditSearch.setId((long) 2);
//		assertEquals((long) 2, Constant.auditSearch.getId());
//	}

	@Test
	public void getTimeStampTest() {
		assertEquals(Constant.time, Constant.auditSearch.getTimeStamp());
	}

	@Test
	public void setTimeStampTest() {
		Constant.auditSearch.setTimeStamp(Constant.time);
		assertEquals(Constant.time, Constant.auditSearch.getTimeStamp());
	}
	
	@Test
	public void getSearchTermTest() {
		assertEquals("search", Constant.auditSearch.getSearchTerm());
	}
	
	@Test
	public void setSearchTermTest() {
		Constant.auditSearch.setSearchTerm("search2");
		assertEquals("search2", Constant.auditSearch.getSearchTerm());
	}

}
