package com.juaracoding.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.juaracoding.junit.pajak.Pajak;

public class TestPajak {

	Pajak pajak;
	double pendapatan;

	@Before
	public void setUp() throws Exception {
		pajak = new Pajak();
	}

	@Ignore
	@Test
	public void testHitungPajak1() {
		pendapatan = 8000;
		double actual = pajak.HitungPajak(pendapatan);
		double expect = 10;

		assertEquals(expect, actual, 0.0);

	}

	@Test(timeout = 1000)
	public void testHitungPajak2() {
		pendapatan = 7000;
		double actual = pajak.HitungPajak(pendapatan);
		double expect = 0;

		assertEquals(expect, actual, 0.0);

	}

}
