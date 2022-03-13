package com.juaracoding.junit3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class TestBangunDatar {
	BangunDatar bangunDatar;

	@Before
	public void setUp() throws Exception {
		bangunDatar = new BangunDatar();

	}

	@Test
	@FileParameters("src/test/resources/persegi.csv")
	public void testLuasPersegi(double s, double expect) {

		double actual = bangunDatar.luasPersegi(s);

		assertEquals(expect, actual, 0.0);

	}

	@Test
	public void testLuasPersegiBukanAngka() {

		String sisiBukanAngka = "A";

		double convert = Double.parseDouble(sisiBukanAngka);

		double actual = bangunDatar.luasPersegi(convert);

		String expect = "A";

		assertEquals(Double.parseDouble(expect), actual, 0.0);

	}

	@Test
	public void testLuasPersegiAngkaNegatif() {

		double s = -2;

		double actual = bangunDatar.luasPersegi(s);

		assertEquals(4, actual, 0.0);

	}

	@Test
	public void testLuasPersegiAngkaNull() {

		double s = 0;
		Double sisiNull = null;

		double actual = bangunDatar.luasPersegi(s);

		assertNull(sisiNull);

		assertEquals(s, actual, 0.0);

	}

	@Test
	@FileParameters("src/test/resources/luasSegitiga.csv")
	public void testLuasSegitiga(double a, double t, double expect) {

		double actual = bangunDatar.luasSegitiga(a, t);

		assertEquals(expect, actual, 0.0);

	}

	@Test
	public void testLuasSegitigaBukanAngka() {

		String alasBukanAngka = "A";
		String tinggiBukanAngka = "B";

		double convertAlas = Double.parseDouble(alasBukanAngka);
		double convertTinggi = Double.parseDouble(tinggiBukanAngka);

		double actual = bangunDatar.luasSegitiga(convertAlas, convertTinggi);

		String expect = "A";

		assertEquals(Double.parseDouble(expect), actual, 0.0);

	}

	@Test
	public void testLuasSegitigaAngkaNegatif() {

		double a = -2;
		double t = -3;

		double actual = bangunDatar.luasSegitiga(a, t);

		assertEquals(3, actual, 0.0);

	}

	@Test
	public void testLuasSegitigaAngkaNull() {

		double a = 0;
		Double alasNull = null;
		double t = 0;
		Double tinggiNull = null;

		double actual = bangunDatar.luasSegitiga(a, t);

		assertNull(alasNull);
		assertNull(tinggiNull);

		assertEquals(a, actual, 0.0);

	}
}
