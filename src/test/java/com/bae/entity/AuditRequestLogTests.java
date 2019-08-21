package com.bae.entity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.util.Constant;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuditRequestLogTests {

	@Test
	public void getUsernameTest() {
		assertEquals("name", Constant.MOCK_AUDITLOG_OBJECT.getUsername());
	}

	@Test
	public void setUsernameTest() {
		Constant.MOCK_AUDITLOG_OBJECT.setUsername("new name");
		assertEquals("new name", Constant.MOCK_AUDITLOG_OBJECT.getUsername());
	}

	@Test
	public void getTimeStampTest() {
		assertEquals(Constant.MOCK_TIME_OBJECT, Constant.MOCK_AUDITUSER_OBJECT.getTimeStamp());
	}

	@Test
	public void setTimeStampTest() {
		Constant.MOCK_AUDITLOG_OBJECT2.setTimeStamp(Constant.MOCK_TIME_OBJECT);
		assertEquals(Constant.MOCK_TIME_OBJECT, Constant.MOCK_AUDITLOG_OBJECT2.getTimeStamp());
	}
}
