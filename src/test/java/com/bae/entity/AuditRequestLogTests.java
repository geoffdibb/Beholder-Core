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
public class AuditRequestLogTests {

	@Test
	public void getUsernameTest() {
		assertEquals("name", Constant.audit.getUsername());
	}

	@Test
	public void setUsernameTest() {
		Constant.audit.setUsername("new name");
		assertEquals("new name", Constant.audit.getUsername());
	}

	@Test
	public void getIdTest() {
		assertEquals((long) 1, Constant.audit.getId());
	}

	@Test
	public void setIdTest() {
		Constant.audit.setId((long) 2);
		assertEquals((long) 2, Constant.audit.getId());
	}

	@Test
	public void getTimeStampTest() {
		assertEquals(Constant.time, Constant.audit.getTimeStamp());
	}

	@Test
	public void setTimeStampTest() {
		Constant.audit.setTimeStamp(Constant.time);
		assertEquals(Constant.time, Constant.audit.getTimeStamp());
	}
}
