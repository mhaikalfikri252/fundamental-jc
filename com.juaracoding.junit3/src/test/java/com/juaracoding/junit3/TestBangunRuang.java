package com.juaracoding.junit3;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class TestBangunRuang {

	BangunRuang bangunRuang;

	@Before
	public void setUp() throws Exception {
		bangunRuang = new BangunRuang();
	}

	@Test
	@FileParameters("src/test/resources/persegi.csv")
	public void testLuasPersegi(double sisi, double expect) {
		double actual = bangunRuang.luasPersegi(sisi);

		assertEquals(expect, actual, 0.0);
	}

	@Test
	@FileParameters("src/test/resources/luasBalok.csv")
	public void testLuasBalok(double p, double l, double t, double expect) {
		double actual = bangunRuang.luasBalok(p, l, t);

		assertEquals(expect, actual, 0.0);
	}

	@Test
	@FileParameters("src/test/resources/volumeBalok.csv")
	public void testVolumeBalok(double p, double l, double t, double expect) {
		double actual = bangunRuang.volumeBalok(p, l, t);

		assertEquals(expect, actual, 0.0);
	}

	@Test
	@FileParameters("src/test/resources/luasTabung.csv")
	public void testLuasTabung(double r, double t, double expect) {
		double actual = bangunRuang.luasTabung(r, t);

		assertEquals(expect, actual, 0.9);
	}

	@Test
	@FileParameters("src/test/resources/volumeTabung.csv")
	public void testVolumeTabung(double r, double t, double expect) {
		double actual = bangunRuang.volumeTabung(r, t);

		assertEquals(expect, actual, 0.9);
	}

	@Test
	@FileParameters("src/test/resources/luasKerucut.csv")
	public void testLuasKerucut(double r, double s, double expect) {
		double actual = bangunRuang.luasKerucut(r, s);

		assertEquals(expect, actual, 0.0);
	}

	@Test
	@FileParameters("src/test/resources/volumeKerucut.csv")
	public void testVolumeKerucut(double r, double t, double expect) {
		double actual = bangunRuang.volumeKerucut(r, t);

		assertEquals(expect, actual, 0.9);
	}

}
