package methods;

public class Main {

	public static void main(String[] args) {
		// methods
		sayiBulma(); // metodu �a��r�yoruz
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
			mesajVer(aranacakSayi + " say�s� mevcuttur.");
		} else {
			mesajVer(aranacakSayi + " say�s� mevcut de�ildir.");
		}
	}
	
	public static void mesajVer(String mesaj)
	{
		System.out.println(mesaj);
	}
}
