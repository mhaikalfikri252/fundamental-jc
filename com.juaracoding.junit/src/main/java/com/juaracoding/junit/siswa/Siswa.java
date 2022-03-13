package com.juaracoding.junit.siswa;

public class Siswa {
	private String nama;
//	private String batch;

	public Siswa(String nama) {
		this.nama = nama;
//		this.batch = batch;
	}

	public String tampilkanNama() {
		System.out.println("Nama: " + nama);
//		System.out.println("Batch: " + batch);
		return nama;
	}
}
