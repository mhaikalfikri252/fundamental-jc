package com.juaracoding.interfaces;

import java.util.Scanner;

interface BangunRuang {
	public String persegi(int sisi);

//	public String persegiPanjang(int panjang, int lebar);

//	public String segitiga(int alas, int tinggi);

}

public class LatihanInterfaces2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Masukkan Sisi: ");
		int inputSisi = scan.nextInt();
//		BangunRuang persegi = (sisi) -> (Math.pow(input, 2));
//		System.out.println("Luas Persegi: " + persegi(inputSisi));

		System.out.print("Masukkan Panjang: ");
		int inputPanjang = scan.nextInt();
		System.out.print("Masukkan lebar: ");
		int inputLebar = scan.nextInt();

		System.out.print("Masukkan Alas: ");
		int inputAlas = scan.nextInt();
		System.out.print("Masukkan Tinggi: ");
		int inputTinggi = scan.nextInt();

	}

}
