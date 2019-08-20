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

	@Test
	public void getUsernameTest() {
		assertEquals("name", Constant.MOCK_AUDITSEARCH_OBJECT.getUsername());
	}

	@Test
	public void setUsernameTest() {
		Constant.MOCK_AUDITSEARCH_OBJECT.setUsername("new name");
		assertEquals("new name", Constant.MOCK_AUDITSEARCH_OBJECT.getUsername());
	}

	@Test
	public void getIdTest() {
		assertEquals((long) 1, Constant.MOCK_AUDITSEARCH_OBJECT.getId());
	}

	@Test
	public void setIdTest() {
		Constant.MOCK_AUDITSEARCH_OBJECT2.setId((long) 2);
		assertEquals((long) 2, Constant.MOCK_AUDITSEARCH_OBJECT2.getId());
	}

	@Test
	public void getTimeStampTest() {
		assertEquals(Constant.MOCK_TIME_OBJECT, Constant.MOCK_AUDITSEARCH_OBJECT.getTimeStamp());
	}

	@Test
	public void setTimeStampTest() {
		Constant.MOCK_AUDITSEARCH_OBJECT.setTimeStamp(Constant.MOCK_TIME_OBJECT);
		assertEquals(Constant.MOCK_TIME_OBJECT, Constant.MOCK_AUDITSEARCH_OBJECT.getTimeStamp());
	}
	
	@Test
	public void getSearchTermTest() {
		assertEquals("search", Constant.MOCK_AUDITSEARCH_OBJECT.getSearchTerm());
	}
	
	@Test
	public void setSearchTermTest() {
		Constant.MOCK_AUDITSEARCH_OBJECT2.setSearchTerm("search2");
		assertEquals("search2", Constant.MOCK_AUDITSEARCH_OBJECT2.getSearchTerm());
	}

}
