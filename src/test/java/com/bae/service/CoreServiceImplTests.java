package com.bae.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.mockito.InjectMocks;

public class CoreServiceImplTests {
	
	@InjectMocks
	CoreService service;
	
	@Test
	public void contextLoads() {
		assertThat(service).isNull();
	}

}
