package com.juaracoding.junit3;

public class BangunRuang {
	public double luasPersegi(double sisi) {
		return Math.pow(sisi, 2);
	}

	public double luasBalok(double p, double l, double t) {
		return 2 * ((p * l) + (p * t) + (l * t));
	}

	public double volumeBalok(double p, double l, double t) {
		return p * l * t;
	}

	public double luasTabung(double r, double t) {
		return 2 * 3.14 * Math.pow(r, 2) * t;
	}

	public double volumeTabung(double r, double t) {
		return 3.14 * Math.pow(r, 2) * t;
	}

	public double luasKerucut(double r, double s) {
		return 3.14 * Math.pow(r, 2) + 3.14 * r * s;
	}

	public double volumeKerucut(double r, double t) {
		return 0.3 * 3.14 * Math.pow(r, 2) * t;
	}
}
