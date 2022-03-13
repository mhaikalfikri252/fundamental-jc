package com.juaracoding.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMethod2 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Ini Before Class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Ini After Class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Ini Before Test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Ini After Test");
	}

	@Test
	public void test2() {
		System.out.println("Ini Test 1");
	}

	@Test
	public void test1() {
		System.out.println("Ini Test 2");
	}

}
