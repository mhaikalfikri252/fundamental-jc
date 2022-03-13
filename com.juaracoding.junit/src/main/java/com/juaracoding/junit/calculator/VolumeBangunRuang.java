package com.juaracoding.junit.calculator;

public class VolumeBangunRuang {

	public int persegiPanjang(int p, int l, int t) {
		return p * l * t;
	}

	public int kubus(int s) {
		return (int) Math.pow(s, 3);
	}

	public double tabung(double r, double t) {
		return 3.14 * Math.pow(r, 2) * t;
	}
}
