package com.juaracoding.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LatihanCollections {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		int limit = 5;

		for (int i = 0; i <= limit; i++) {
			int add = scan.nextInt();
			arrayList.add(add);

		}

		// Before Sorting
		for (int i : arrayList) {
			System.out.print(i + " ");
		}

		// After Sorting
		bubbleSortArrayList(arrayList);

	}

	public static void bubbleSortArrayList(List<Integer> list) {
		Integer temp;
		boolean sorted = false;

		while (!sorted) {
			sorted = true;
			for (int i = 0; i < list.size() - 1; i++) {
				if (list.get(i).compareTo(list.get(i + 1)) > 0) {
					temp = list.get(i);
					list.set(i, list.get(i + 1));
					list.set(i + 1, temp);
					sorted = false;
				}
			}
		}
	}

}
