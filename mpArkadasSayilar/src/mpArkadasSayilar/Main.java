package mpArkadasSayilar;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// Arkada� say�lar 220 -284

		int sayi1 = 220, sayi2 = 284;
		int toplam1 = 0, toplam2 = 0;

		for (int i = 1; i < sayi1; i++) {
			if (sayi1 % i == 0) {
				toplam1 += i;
			}
		}
		System.out.println(sayi1 + " in b�lenleri toplam� : " + toplam1);

		for (int i = 1; i < sayi2; i++) {
			if (sayi2 % i == 0) {
				toplam2 += i;
			}
		}
		System.out.println(sayi2 + " in b�lenleri toplam� : " + toplam2);

		if (sayi1 == toplam2) {
			System.out.println(sayi1 + " ve " + sayi2 + " arkada� say�lard�r.");
		}
	}
}
