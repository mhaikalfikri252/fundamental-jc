package com.juaracoding.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.juaracoding.junit.array.DataArray;

public class TestDataArray {

	DataArray array;

	@Before
	public void setUp() throws Exception {
		array = new DataArray();
	}

	@Test
	public void testCariMax() {

		int angka[] = { 10, 11, 12, 13 };
		int actual = array.cariMax(angka);

		assertEquals(13, actual);

	}

	@Test
	public void testCariMaxNegatif() {

		int angka[] = { -10, -11, -12, -13 };
		int actual = array.cariMax(angka);

		assertEquals(-10, actual);

	}

}
