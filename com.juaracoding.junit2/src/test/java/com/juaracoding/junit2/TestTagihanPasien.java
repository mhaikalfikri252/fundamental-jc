package com.juaracoding.junit2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.juaracoding.junit2.pasien.Pasien;
import com.juaracoding.junit2.pasien.TagihanPasien;

public class TestTagihanPasien {

	Pasien pasien;
	TagihanPasien tagihanPasien;

	@Before
	public void setUp() throws Exception {
		pasien = new Pasien();
		tagihanPasien = new TagihanPasien();
	}

	@Test
	public void test1() {
		pasien.setId(1);
		pasien.setNama("Test Nama");
		pasien.setKelas("Kelas VIP");
		pasien.setDay(3);

		double expect = 250000 * pasien.getDay();
		double actual = tagihanPasien.totalTagihan(pasien);

		assertEquals(expect, actual, 0.0);
	}

	@Test
	public void test2() {
		pasien.setId(2);
		pasien.setNama("Test Nama2");
		pasien.setKelas("Kelas 1");
		pasien.setDay(4);

		double expect = 200000 * pasien.getDay();
		double actual = tagihanPasien.totalTagihan(pasien);

		assertEquals(expect, actual, 0.0);
	}

}
