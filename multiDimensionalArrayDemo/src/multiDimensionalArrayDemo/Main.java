package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		// multiDimensional Arrays

		String[][] sehirler = new String[3][3];
		// ilki satýr 2.si sütundur - Bölge / Sehir
		sehirler[0][0] = "Ýstanbul"; // Ýlk bölgemiz Marmara Bölgesi
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Ankara"; //2.bölge Ýç Anadolu
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Diyarbakýr"; // 3.bölge GDA
		sehirler[2][1] = "Þanlýurfa";
		sehirler[2][2] = "Gaziantep";

		// 3x3 = 9 eleman vardýr.
		//System.out.println(sehirler.length);
		for (int i = 0; i < sehirler.length; i++) {
			//satýrlarý gezeceðim
			System.out.println("-----------------------");
			for (int j = 0; j < sehirler.length; j++) {
				System.out.println(sehirler[i][j]);				
			}			
		}
	}
}
