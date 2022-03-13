package com.juaracoding.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.juaracoding.junit.calculator.Calculator;

public class TestCalculator3 {

	Calculator calculator;
	int a, b;

	@Before
	public void setUp() throws Exception {
		calculator = new Calculator();
		a = 10;
		b = 20;
	}

	@Test
	public void testAdd() {
		int actual = calculator.add(a, b);
		int expect = 30;

		assertEquals(expect, actual);
	}

	@Test
	public void testSubstract() {
		int actual = calculator.substract(a, b);
		int expect = 10;

		assertEquals(expect, actual, 0.0);
	}

	@Test
	public void testMultiply() {
		int actual = calculator.multiply(a, b);
		int expect = 200;

		assertEquals(expect, actual);
	}

}
