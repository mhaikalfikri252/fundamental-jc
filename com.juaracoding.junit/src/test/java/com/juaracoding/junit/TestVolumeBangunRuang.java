package com.juaracoding.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.juaracoding.junit.calculator.VolumeBangunRuang;

public class TestVolumeBangunRuang {

	VolumeBangunRuang volumeBangunRuang;
	int p, l, t, s, r;

	@Before
	public void start() {
		volumeBangunRuang = new VolumeBangunRuang();
	}

	@Test
	public void testPersegiPanjang() {
		p = 1;
		l = 2;
		t = 3;
		int actual = volumeBangunRuang.persegiPanjang(p, l, t);
		int expect = 6;
//		int expect = -6;

		assertEquals(expect, actual);
	}

	@Test
	public void testKubus() {
		s = 4;
		int actual = volumeBangunRuang.kubus(s);
		int expect = 64;
//		int expect = -64;

		assertEquals(expect, actual);
	}

	@Test
	public void testTabung() {
		r = 5;
		t = 3;
		double actual = volumeBangunRuang.tabung(r, t);
		double expect = 235.5;
//		double expect = -235.5;

		assertEquals(expect, actual, 0.0);
	}

}
