package com.juaracoding.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.juaracoding.junit.siswa.Siswa;

public class TestSiswa {

	String expect_nama = "Koswara";
	Siswa siswa = new Siswa(expect_nama);

	@Test
	public void testTampilkanData() {
		assertEquals(expect_nama, siswa.tampilkanNama());
	}

}
