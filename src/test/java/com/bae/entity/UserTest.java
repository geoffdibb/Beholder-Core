package com.bae.entity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.util.Constant;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
	
	@Test
	public void getUsernameTest() {
		assertEquals("name", Constant.MOCK_USER_OBJECT2.getUsername());
	}

	@Test
	public void setUsernameTest() {
		Constant.MOCK_USER_OBJECT3.setUsername("new name");
		assertEquals("new name", Constant.MOCK_USER_OBJECT3.getUsername());
	}

	@Test
	public void getIdTest() {
		assertEquals((long) 1, Constant.MOCK_USER_OBJECT2.getId());
	}

	@Test
	public void setIdTest() {
		Constant.MOCK_USER_OBJECT3.setId((long) 2);
		assertEquals((long) 2, Constant.MOCK_USER_OBJECT3.getId());
	}

}
