package methodOverloading;

public class Main {

	public static void main(String[] args) {
		// Metot overloading
		int sonuc = 0;
		DortIslem dortIslem = new DortIslem();
		sonuc = dortIslem.topla(6, 7);
		System.out.println(sonuc);
		sonuc = dortIslem.topla(1,9,8);
		System.out.println(sonuc);
	}
}
