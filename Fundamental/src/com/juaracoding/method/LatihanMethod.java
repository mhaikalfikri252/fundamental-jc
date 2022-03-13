package com.juaracoding.method;

import java.util.Scanner;

public class LatihanMethod {

	public static void main(String[] args) {

		choice();

	}

	static void choice() {
		Scanner scan = new Scanner(System.in);
		System.out.println("==========================");
		System.out.println("1. Kubus");
		System.out.println("2. Balok");
		System.out.print("Pilih Rumus Bangun Ruang : ");
		int num = scan.nextInt();
		System.out.println("==========================");

		switch (num) {
		case 1: {
			kubus();
			break;
		}
		case 2: {
			balok();
			break;
		}
		default:
			System.out.println("Pilihan yang Anda pilih tidak tersedia");
		}
	}

	static void kubus() {
		Scanner scan = new Scanner(System.in);
		System.out.println("1. Luas Permukaan Kubus");
		System.out.println("2. Volume Kubus");
		System.out.print("Pilih Rumus : ");
		int num = scan.nextInt();
		System.out.println("==========================");

		switch (num) {
		case 1: {
			System.out.print("Masukkan Sisi Kubus : ");
			int add = scan.nextInt();
			int math = (int) Math.pow(add, 2);
			int total = 6 * math;
			System.out.println("Luas Permukaan Kubus adalah : " + total);
			break;
		}
		case 2: {
			System.out.print("Masukkan Sisi Kubus : ");
			int input = scan.nextInt();
			int total = (int) Math.pow(input, 3);
			System.out.println("Volume Kubus adalah : " + total);
			break;
		}
		default:
			System.out.println("Pilihan yang Anda pilih tidak tersedia");
		}

	}

	static void balok() {
		Scanner scan = new Scanner(System.in);
		System.out.println("1. Luas Permukaan Balok");
		System.out.println("2. Volume Balok");
		System.out.print("Pilih Rumus : ");
		int num = scan.nextInt();
		System.out.println("==========================");

		switch (num) {
		case 1: {
			System.out.print("Masukkan Panjang Balok : ");
			int panjang = scan.nextInt();
			System.out.print("Masukkan Lebar Balok : ");
			int lebar = scan.nextInt();
			System.out.print("Masukkan Tinggi Balok : ");
			int tinggi = scan.nextInt();
			int total = panjang * lebar * tinggi;
			System.out.println("Luas Permukaan Balok adalah : " + total);
			break;
		}
		case 2: {
			System.out.print("Masukkan Panjang Balok : ");
			int panjang = scan.nextInt();
			System.out.print("Masukkan Lebar Balok : ");
			int lebar = scan.nextInt();
			System.out.print("Masukkan Tinggi Balok : ");
			int tinggi = scan.nextInt();
			int total = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
			System.out.println("Volume Balok adalah : " + total);
			break;
		}
		default:
			System.out.println("Pilihan yang Anda pilih tidak tersedia");
		}

	}

}
