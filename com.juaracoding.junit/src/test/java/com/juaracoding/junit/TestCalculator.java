package com.juaracoding.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.juaracoding.junit.calculator.Calculator;

public class TestCalculator {

	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		int a = 10, b = 20;

		int actual = calculator.add(a, b);

		int expect = 30;

		assertEquals(expect, actual);

	}

}
