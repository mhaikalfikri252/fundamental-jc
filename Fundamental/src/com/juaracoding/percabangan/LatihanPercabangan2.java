package com.juaracoding.percabangan;

import java.util.Scanner;
import java.util.*;

public class LatihanPercabangan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Pilih Ruangan : ");
		String choice = scan.nextLine();
		System.out.print("Masukkan Hari : ");
		int day = scan.nextInt();
		
		Map<String, Integer> ruangan = new HashMap<String, Integer>(); 
		 ruangan.put("Kelas VIP", 200000);
		 ruangan.put("Kelas 1", 150000);
		 ruangan.put("Kelas 2", 90000); 
		 ruangan.put("Kelas 3", 50000);
		 
		 if(choice.equalsIgnoreCase("Kelas VIP")) {
			 System.out.println("Tagihan Permalam : " + ruangan.get("Kelas VIP") * day);
		 } else if (choice.equalsIgnoreCase("Kelas 1")) {
			 System.out.println("Tagihan Permalam : " + ruangan.get("Kelas 1") * day);
		 } else if (choice.equalsIgnoreCase("Kelas 2")) {
			 System.out.println("Tagihan Permalam : " + ruangan.get("Kelas 2") * day);
		 } else if (choice.equalsIgnoreCase("Kelas 3")) {
			 System.out.println("Tagihan Permalam : " + ruangan.get("Kelas 3") * day);
		 } else {
			 System.out.println("Kamar Tidak Tersedia");
		 }
		 
		 
	}

}
