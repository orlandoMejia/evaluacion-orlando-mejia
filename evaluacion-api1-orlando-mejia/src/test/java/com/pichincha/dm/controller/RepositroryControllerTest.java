package com.pichincha.dm.controller;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.ConfigDataApplicationContextInitializer;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

import com.pichincha.dm.OptimusMainApplication;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = OptimusMainApplication.class)
@ContextConfiguration(initializers = ConfigDataApplicationContextInitializer.class)
@ActiveProfiles("integration")
class RepositroryControllerTest {

	public static final String CONTENTYPE = "Content-Type";

	public static final String APLICATIONJSON = "application/json";
	
	public static final String BASE_URL = "http://localhost:%s%s%s%s";

	@Value("${server.servlet.context-path}")
	private String context;

	@LocalServerPort
	int port;

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Test
	final void shouldReturn200WhenFindAll() {
		String url = String.format("http://localhost:%s%s%s", port, context, "/repository/projects");

		HttpHeaders headers = generateHeaders();

		ResponseEntity<String> response = testRestTemplate.exchange(url, HttpMethod.GET, new HttpEntity<>(headers), String.class);
		
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}
	
	@Test
	final void shouldReturn200WhenFindByProjectName() {
		
		String name = "PROJECT-1";
		
		String url = String.format(BASE_URL, port, context, "/repository/project-name/", name);

		HttpHeaders headers = generateHeaders();

		ResponseEntity<String> response = testRestTemplate.exchange(url, HttpMethod.GET, new HttpEntity<>(headers), String.class);
		
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}
	
	@Test
	final void shouldReturn200WhenFindByIdCell() {
		
		Long idCell = 1L;
		
		String url = String.format(BASE_URL, port, context, "/repository/cell/", idCell);

		HttpHeaders headers = generateHeaders();

		ResponseEntity<String> response = testRestTemplate.exchange(url, HttpMethod.GET, new HttpEntity<>(headers), String.class);
		
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}
	
	@Test
	final void shouldReturn200WhenFindByIdTribe() {
		
		Long idTribe = 1L;
		
		String url = String.format(BASE_URL, port, context, "/repository/tribe/", idTribe);

		HttpHeaders headers = generateHeaders();

		ResponseEntity<String> response = testRestTemplate.exchange(url, HttpMethod.GET, new HttpEntity<>(headers), String.class);
		
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}

	private HttpHeaders generateHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.set(CONTENTYPE, APLICATIONJSON);
		headers.set("guid", UUID.randomUUID().toString());
		return headers;
	}
}