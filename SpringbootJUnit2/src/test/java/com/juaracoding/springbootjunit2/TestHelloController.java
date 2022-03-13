package com.juaracoding.springbootjunit2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class TestHelloController {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testAbout() {

		String actual = this.restTemplate.getForObject("/about", String.class);
		String expect = "JUnit and Springboot URL";

		assertEquals(expect, actual);
	}

}
