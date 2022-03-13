package com.juaracoding.percabangan;

import java.util.Scanner;

public class LatihanPercabangan3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Usia : ");
		int usia = scan.nextInt();
		
		if(usia > 17) {
			System.out.print("Berat Badan : ");
			int berat = scan.nextInt();
			if (berat > 50) {
				System.out.println("Anda Boleh Untuk Donor Darah");
			} else {
				System.out.println("Berat Badan Anda Belum Cukup Untuk Donor Darah");
			}
		} else {
			System.out.println("Usia Anda Belum Cukup Untuk Donor Darah");
		}
	}
}
