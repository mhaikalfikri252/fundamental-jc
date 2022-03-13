package com.juaracoding.main;

import java.time.LocalDateTime;
import java.util.Scanner;

//public class InputData {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("Nama : ");
//		String nama = scan.nextLine();
//		System.out.println("Nama : " + nama);
//		
//		System.out.print("Usia : ");
//		int usia = scan.nextInt();
//		System.out.print("Usia : " + usia);
//	}
//}

//import java.util.Scanner;
//
//public class InputData {
//  public static void main(String[] args) {
//    Scanner scan = new Scanner(System.in);
//    Scanner gradeScan = new Scanner(System.in);
//    String nama = scan.next();
//    int batch = scan.nextInt();
//    String grade = scan.nextLine();
//    
//    System.out.println("Nama: " + nama);
//    System.out.println("Batch: " + batch);
//    System.out.println("Grade: " + grade);
//  }
//}

import java.util.Scanner;
import java.text.DecimalFormat;

public class InputData {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	DecimalFormat df = new DecimalFormat("#.##");
    int qty = scan.nextInt();
    double harga = scan.nextDouble();
    double jumlah = qty * harga;
    
    System.out.println("Qty: " + qty);
    System.out.println("Harga: " + harga);
    System.out.println("Jumlah: " + df.format(jumlah));
}
}