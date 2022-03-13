package com.juaracoding.oop;

import java.util.Scanner;

public class LatihanOOP extends Mahasiswa {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		LatihanOOP mahasiswa = new LatihanOOP();

		System.out.println("Masukkan Nim : ");
		mahasiswa.nim = scan.nextInt();
		System.out.println("Masukkan Nama : ");
		mahasiswa.nama = scan.next();
		System.out.println("Masukkan Prodi : ");
		mahasiswa.prodi = scan.next();
		System.out.println("========================");
		System.out.println(mahasiswa.nim);
		System.out.println(mahasiswa.nama);
		System.out.println(mahasiswa.prodi);

//		mobil();
	}

	static void mobil() {
		Scanner scan = new Scanner(System.in);

		Mobil mobil = new Mobil();

		System.out.print("Masukkan Merk Mobil : ");
		String merk = scan.next();
		mobil.setMerk(merk);
		System.out.print("Masukkan Tipe Mobil : ");
		String tipe = scan.next();
		mobil.setTipe(tipe);
		System.out.print("Masukkan Warna Mobil : ");
		String warna = scan.next();
		mobil.setWarna(warna);
		System.out.print("Masukkan Tahun Produksi Mobil : ");
		int tahun = scan.nextInt();
		mobil.setTahun(tahun);
		System.out.println("==========================");
		System.out.print("Deskripsi Mobil : " + mobil.getMerk() + " " + mobil.getTipe() + " " + mobil.getWarna() + " "
				+ mobil.getTahun());

	}

}
