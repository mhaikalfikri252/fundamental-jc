package com.juaracoding.array;

import java.util.Scanner;

public class LatihanArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] motor = new String[3];
		for (int i = 0; i < motor.length; i++) {
			int a = i + 1;
			System.out.print("Masukkan Jenis Motor " + a + ": ");
			motor[i] = scan.next();
		}

		for (String w : motor) {
			System.out.println(w);
		}

		int angka[] = new int[10];
		angka[0] = 10;
		angka[1] = 11;
		angka[2] = 12;
		angka[3] = 13;
		angka[4] = 14;
		angka[5] = 15;
		angka[6] = 16;
		angka[7] = 17;
		angka[8] = 18;
		angka[9] = 19;

//		for (int i = 0; i < angka.length; i++) {
//			System.out.print(angka[i] + " ");
//		}

		for (int k : angka) {
			System.out.print(k + " ");
		}
	}

}
