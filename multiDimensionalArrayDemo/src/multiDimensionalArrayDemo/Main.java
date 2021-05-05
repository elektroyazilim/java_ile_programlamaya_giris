package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		// multiDimensional Arrays

		String[][] sehirler = new String[3][3];
		// ilki sat�r 2.si s�tundur - B�lge / Sehir
		sehirler[0][0] = "�stanbul"; // �lk b�lgemiz Marmara B�lgesi
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Ankara"; //2.b�lge �� Anadolu
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Diyarbak�r"; // 3.b�lge GDA
		sehirler[2][1] = "�anl�urfa";
		sehirler[2][2] = "Gaziantep";

		// 3x3 = 9 eleman vard�r.
		//System.out.println(sehirler.length);
		for (int i = 0; i < sehirler.length; i++) {
			//sat�rlar� gezece�im
			System.out.println("-----------------------");
			for (int j = 0; j < sehirler.length; j++) {
				System.out.println(sehirler[i][j]);				
			}			
		}
	}
}
