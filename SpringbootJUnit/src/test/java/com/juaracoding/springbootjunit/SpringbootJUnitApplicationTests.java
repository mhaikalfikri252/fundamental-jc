package com.juaracoding.springbootjunit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootJUnitApplicationTests {

	@Autowired
	public MessageComponent messageComponent;

	@Test
	public void testMessage() {
		String expect = "Hello World";
		String actual = messageComponent.getMessage();

		assertEquals(expect, actual);
	}

}
