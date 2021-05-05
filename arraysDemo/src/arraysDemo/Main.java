package arraysDemo;

public class Main {

	public static void main(String[] args) {
		// arrays

		String[] ogrenciler = new String[3];
		
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Salih";
		ogrenciler[2] = "Ahmet";
		
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
	}
}
