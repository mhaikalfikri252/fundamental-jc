package com.juaracoding.junit.array;

public class DataArray {

	public int cariMax(int angka[]) {
//		int max = 0;
		int max = angka[0];

		for (int i = 1; i < angka.length; i++) {
			if (max < angka[i]) {
				max = angka[i];
			}
		}

		return max;
	}
}
