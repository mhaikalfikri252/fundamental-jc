package com.juaracoding.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.juaracoding.junit.calculator.Calculator;

public class TestCalculator2 {

	Calculator calculator;
	int a, b;

	@Before
	public void setUp() throws Exception {

		calculator = new Calculator();

	}

	@Test
	public void testAdd() {
		a = 10;
		b = 20;
		int actual = calculator.add(a, b);
		int expect = 30;

		assertEquals(expect, actual);
	}

	@Test
	public void testSubstract() {
		a = 10;
		b = 20;
		int actual = calculator.substract(a, b);
		int expect = 10;

		assertEquals(expect, actual);
	}

	@Test
	public void testMultiply() {
		a = 10;
		b = 20;
		int actual = calculator.multiply(a, b);
		int expect = 200;

		assertEquals(expect, actual);
	}

}
