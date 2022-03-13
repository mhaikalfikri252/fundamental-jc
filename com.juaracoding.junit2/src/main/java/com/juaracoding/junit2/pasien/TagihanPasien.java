package com.juaracoding.junit2.pasien;

public class TagihanPasien {
	public double totalTagihan(Pasien pasien) {
		double total = 0;

		if (pasien.getKelas() == "Kelas VIP") {
			total = 250000 * pasien.getDay();

		} else if (pasien.getKelas() == "Kelas 1") {
			total = 200000 * pasien.getDay();

		}

		return total;
	}
}
