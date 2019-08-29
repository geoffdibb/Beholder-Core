package com.bae.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.service.CoreService;
import com.bae.util.Constant;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoreControllerTests {

	@InjectMocks
	CoreController controller;

	@Mock
	CoreService service;

	@Mock
	JmsTemplate jmsTemplate;

	@Test
	public void contextLoads() {
		assertThat(controller).isNotNull();
	}

	@Test
	public void userLoginTest() {
		Mockito.when(service.userLogin(Constant.MOCK_USER_OBJECT)).thenReturn(Constant.MOCK_USERLOGIN_OBJECT2);
		assertEquals(Constant.MOCK_USERLOGIN_OBJECT, controller.userLogin(Constant.MOCK_USER_OBJECT));
		Mockito.verify(service).userLogin(Constant.MOCK_USER_OBJECT);
	}

	@Test
	public void searchTest() {
		Mockito.when(service.search("category", "searchTerm", "user1")).thenReturn(Constant.MOCK_SEARCH_OBJECT2);
		assertEquals(Constant.MOCK_SEARCH_OBJECT, controller.search("category", "searchTerm", "user1"));
		Mockito.verify(service).search("category", "searchTerm", "user1");
	}

	@Test
	public void getProfileTest() {
		Mockito.when(service.getProfile(3)).thenReturn(Constant.MOCK_PROFILE_OBJECT2);
		assertEquals(Constant.MOCK_PROFILE_OBJECT, controller.getProfile(3));
		Mockito.verify(service).getProfile(3);
	}

	@Test
	public void getAssociatesTest() {
		Mockito.when(service.getAssociates(3)).thenReturn(Constant.MOCK_PROFILE_OBJECT2);
		assertEquals(Constant.MOCK_PROFILE_OBJECT, controller.getAssociates(3));
		Mockito.verify(service).getAssociates(3);
	}

	@Test
	public void getAuditRequestLogTest() {
		Mockito.when(service.getAuditRequestLog()).thenReturn(Constant.MOCK_AUDIT_OBJECT2);
		assertEquals(Constant.MOCK_AUDIT_OBJECT, controller.getAuditRequestLog());
		Mockito.verify(service).getAuditRequestLog();
	}

	@Test
	public void getAuditUserAccessLog() {
		Mockito.when(service.getAuditUserAccessLog(Constant.MOCK_USERNAME_OBJECT)).thenReturn(Constant.MOCK_AUDIT_OBJECT2);
		assertEquals(Constant.MOCK_AUDIT_OBJECT, controller.getAuditUserAccessLog(Constant.MOCK_USERNAME_OBJECT));
		Mockito.verify(service).getAuditUserAccessLog(Constant.MOCK_USERNAME_OBJECT);
	}

	@Test
	public void getSearchLogTest() {
		Mockito.when(service.getSearchLog(Constant.MOCK_USERNAME_OBJECT)).thenReturn(Constant.MOCK_AUDIT_OBJECT2);
		assertEquals(Constant.MOCK_AUDIT_OBJECT, controller.getSearchLog(Constant.MOCK_USERNAME_OBJECT));
		Mockito.verify(service).getSearchLog(Constant.MOCK_USERNAME_OBJECT);
	}

	@Test
	public void getServiceTest() {
		assertEquals(service, controller.getService());
	}

	@Test
	public void setServiceTest() {
		controller.setService(service);
		assertEquals(service, controller.getService());
	}

	@Test
	public void getJmsTemplateTest() {
		assertEquals(jmsTemplate, controller.getJmsTemplate());
	}

	@Test
	public void setJmsTemplateTest() {
		controller.setJmsTemplate(jmsTemplate);
		assertEquals(jmsTemplate, controller.getJmsTemplate());
	}

	@Test
	public void okNoBody() {
		ResponseEntity<Void> responseEntity = ResponseEntity.ok().build();

		assertThat(responseEntity).isNotNull();
		assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat(responseEntity.getBody()).isNull();
	}

	@Test
	public void okEntity() {
		Integer entity = 42;
		ResponseEntity<Integer> responseEntity = ResponseEntity.ok(entity);

		assertThat(responseEntity).isNotNull();
		assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat((int) responseEntity.getBody()).isEqualTo((int) entity);
	}

	@Test
	public void ofOptional() {
		Integer entity = 42;
		ResponseEntity<Integer> responseEntity = ResponseEntity.of(Optional.of(entity));

		assertThat(responseEntity).isNotNull();
		assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat((int) responseEntity.getBody()).isEqualTo((int) entity);
	}

	@Test
	public void ofEmptyOptional() {
		ResponseEntity<Integer> responseEntity = ResponseEntity.of(Optional.empty());

		assertThat(responseEntity).isNotNull();
		assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
		assertThat(responseEntity.getBody()).isNull();
	}

	@Test
	public void createdLocation() throws URISyntaxException {
		URI location = new URI("location");
		ResponseEntity<Void> responseEntity = ResponseEntity.created(location).build();

		assertThat(responseEntity).isNotNull();
		assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.CREATED);
		assertThat(responseEntity.getHeaders().containsKey("Location")).isTrue();
		assertThat(responseEntity.getHeaders().getFirst("Location")).isEqualTo(location.toString());
		assertThat(responseEntity.getBody()).isNull();

		ResponseEntity.created(location).header("MyResponseHeader", "MyValue").body("Hello World");
	}

	@Test
	public void acceptedNoBody() throws URISyntaxException {
		ResponseEntity<Void> responseEntity = ResponseEntity.accepted().build();

		assertThat(responseEntity).isNotNull();
		assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.ACCEPTED);
		assertThat(responseEntity.getBody()).isNull();
	}

}
