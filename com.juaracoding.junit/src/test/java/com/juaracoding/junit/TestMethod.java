package com.juaracoding.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMethod {

	@BeforeClass
	public static void persiapanClass() {
		System.out.println("Ini Before Class");
	}

	@Before
	public void persiapanMethod() {
		System.out.println("Ini Before Test");
	}

	@Test
	public void testAdd() {
		System.out.println("Ini Test Add");
	}

	@Test
	public void testMultiply() {
		System.out.println("Ini Test Multiply");
	}

	@Test
	public void testTiga() {
		System.out.println("Ini Test Tiga");
	}

	@After
	public void setelahMethod() {
		System.out.println("Ini After Test");
	}

	@AfterClass
	public static void setelahClass() {
		System.out.println("Ini After Class");
	}

}
