package com.juaracoding.interfaces;

import java.util.Scanner;

interface BangunDatar {
	public String bangunDatar(int n, int o);
}

public class LatihanInterfaces {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int input = scan.nextInt();
		int input2 = scan.nextInt();
		double total = 0.5 * input * input2;
		BangunDatar bangunDatar = (n,
				o) -> ("Luas Persegi Panjang = " + input + " x " + input2 + " = " + (input * input2));
		System.out.println(bangunDatar.bangunDatar(input, input2));
		BangunDatar bangunDatar2 = (n,
				o) -> ("Luas Segitiga = " + "0.5" + " x " + input + " x " + input2 + " = " + Math.round(total));
		System.out.println(bangunDatar2.bangunDatar(input, input2));

	}

}
