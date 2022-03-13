package com.juaracoding.array;

import java.util.Scanner;

public class LatihanArray2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int array[] = new int[5];
		int sum = 0;
		float rataRata = 0;

		for (int i = 0; i < array.length; i++) {
			int a = i + 1;
			System.out.print("Masukkan Angka Ke-" + a + ": ");
			array[i] = scan.nextInt();
		}

		for (int total : array) {
			sum = sum + total;
			rataRata = total / 5;
		}

		System.out.println("Rata-Rata Elemen Array : " + rataRata);
		System.out.println("Total Jumlah Elemen Array : " + sum);

	}

}
