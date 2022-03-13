package com.juaracoding.percabangan;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LatihanPercabangan4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Ruangan Yang Tersedia: ");
		System.out.println("Kelas VIP");
		System.out.println("Kelas 1");
		System.out.println("Kelas 2");
		System.out.println("Kelas 3");
		System.out.println("======================");
		System.out.print("Pilih Ruangan : ");
		String choice = scan.nextLine();
		
		Map<String, Integer> ruangan = new HashMap<String, Integer>(); 
		 ruangan.put("Kelas VIP", 200000);
		 ruangan.put("Kelas 1", 150000);
		 ruangan.put("Kelas 2", 90000); 
		 ruangan.put("Kelas 3", 50000);
		
		switch(choice) {
		case "Kelas VIP":
			 System.out.println("Note : Kelas VIP Ruangan Hanya Berisi 1 Orang");
			 System.out.print("Masukkan Hari : ");
			 int dayVIP = scan.nextInt();
			 System.out.println("Tagihan Permalam : " + ruangan.get("Kelas VIP") * dayVIP);
			 break;
		case "Kelas 1":
			 System.out.println("Note : Kelas 1 Ruangan Maksimal Berisi 2 Orang");
			 System.out.print("Masukkan Hari : ");
			 int day1 = scan.nextInt();
			 System.out.println("Tagihan Permalam : " + ruangan.get("Kelas 1") * day1);
			 break;
		case "Kelas 2":
			 System.out.println("Note : Kelas 2 Ruangan Maksimal Berisi 4 Orang");
			 System.out.print("Masukkan Hari : ");
			 int day2 = scan.nextInt();
			 System.out.println("Tagihan Permalam : " + ruangan.get("Kelas 2") * day2);
			 break;
		case "Kelas 3":
			 System.out.println("Note : Kelas 2 Ruangan Maksimal Berisi 6 Orang");
			 System.out.print("Masukkan Hari : ");
			 int day3 = scan.nextInt();
			 System.out.println("Tagihan Permalam : " + ruangan.get("Kelas 3") * day3);
			 break;
		default:
			 System.out.println("Kelas Yang Anda Pilih Tidak Tersedia");
			 break;
		}
	}

}
