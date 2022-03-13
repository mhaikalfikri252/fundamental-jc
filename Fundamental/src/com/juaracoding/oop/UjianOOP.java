package com.juaracoding.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UjianOOP {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> data = new ArrayList<String>();

		for (int i = 0; i < 6; i++) {
			String input = scan.next();
			data.add(input);
		}

		int item = scan.nextInt();

		System.out.println(data);

//		Set<String> set = new HashSet<>(data);

		Collections.sort(data, Collections.reverseOrder());
		System.out.println("Sort Desc: " + data);
		data.remove(item);
		System.out.print("Delete Item Index ke-" + item + ": " + data);
	}
}