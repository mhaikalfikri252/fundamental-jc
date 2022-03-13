package com.juaracoding.junit.assert1;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class ContohAssert {

	@Test
	public void testAssert1() {
		// Equals
		String expect = "Juaracoding";
		String actual = "Juaracoding";

		assertEquals("Ada error", expect, actual);
	}

	@Test
	public void testAssert2() {
		// Array Equals
		char[] expect = { 'J', 'u', 'a', 'r', 'a' };
		char[] actual = "Juara".toCharArray();

		assertArrayEquals(expect, actual);
	}

	@Test
	public void testAssert3() {
		// Array Equals Null
		char[] expect = null;
		char[] actual = null;

		assertArrayEquals(expect, actual);
	}

	@Test
	public void testAssert4() {
		// Null
		Object motor = null;

		assertNull("Object motor harus null", motor);
	}

	@Test
	public void testAssert5() {
		// Null
		Object mobil = new Object();
		Object motor = new Object();

		assertNotSame(mobil, motor);
	}

	@Test
	public void testAssert6() {
		// True or False
		assertTrue("10 lebih besar dari 8", 10 > 8);
		assertFalse("10 lebih besar dari 12", 10 > 12);

	}

	@Test
	public void testAssert7() {
		// That
		assertThat(Arrays.asList("Java", "Python", "Kotlin"), hasItems("Java", "Python"));
	}

}
