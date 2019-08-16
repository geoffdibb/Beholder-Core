package com.bae.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.service.CoreService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoreControllerTests {

	@InjectMocks
	CoreController controller;

	@Mock
	CoreService service;

	@Test
	public void contextLoads() {
		assertThat(controller).isNotNull();
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
	public void getAssociatesTest() {

	}

}
