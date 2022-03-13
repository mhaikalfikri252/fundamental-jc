package com.juaracoding.percabangan;

import java.time.LocalDate;
import java.util.Scanner;

public class LatihanPostTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String date = input.next();
		String month = input.next();
		String year = input.next();

		int d = Integer.parseInt(date);
		int m = Integer.parseInt(month);
		int y = Integer.parseInt(year);

		LocalDate ld = LocalDate.of(y, m, d);

		System.out.println(ld.getDayOfWeek());
	}

}
