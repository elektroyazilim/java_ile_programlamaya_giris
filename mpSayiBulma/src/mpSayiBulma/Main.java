package mpSayiBulma;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// Sayý Bulma
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacakSayi = 9;
		
		for (int sayi  : sayilar) {
			if (sayi == aranacakSayi) {
				System.out.println("Sayý bulundu");
				return;
			}
		}
		System.out.println("Sayý bulunamadý");		
	}
}
