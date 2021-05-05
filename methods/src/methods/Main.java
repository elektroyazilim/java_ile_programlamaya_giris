package methods;

public class Main {

	public static void main(String[] args) {
		// methods
		sayiBulma(); // metodu çaðýrýyoruz
	}

	public static void sayiBulma() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacakSayi = 6;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacakSayi) {
				varMi = true;
				break;
			}
		}
		if (varMi) {
			mesajVer(aranacakSayi + " sayýsý mevcuttur.");
		} else {
			mesajVer(aranacakSayi + " sayýsý mevcut deðildir.");
		}
	}
	
	public static void mesajVer(String mesaj)
	{
		System.out.println(mesaj);
	}
}
