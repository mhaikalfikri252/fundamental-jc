package com.juaracoding.percabangan;

import java.util.Scanner;

public class LatihanPercabangan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.print("Masukkan Nominal Belanja : ");
//		int belanja = scan.nextInt();
//		
//		if (belanja >= 100000) {
//			System.out.println("Selamat Anda Mendapatkan Hadiah Berupa Sepeda");
//		} else {
//			System.out.println("Nominalnya Belum Cukup Untuk Mendapatkan Hadiah");
//		}
		
		System.out.print("Input Huruf : ");
		String huruf = scan.nextLine();
		String hurufVokal [] = {"A", "I", "U", "E", "O"};
		
		
		if(huruf.equalsIgnoreCase(hurufVokal[0]) 
			|| huruf.equalsIgnoreCase(hurufVokal[1]) 
			|| huruf.equalsIgnoreCase(hurufVokal[2]) 
			|| huruf.equalsIgnoreCase(hurufVokal[3]) 
			|| huruf.equalsIgnoreCase(hurufVokal[4])
		  ) {
			System.out.println("Huruf Vokal");
		} else {
			System.out.println("Huruf Konsonan");
		}
	}

}
