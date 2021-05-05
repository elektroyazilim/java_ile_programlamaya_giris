package mpAsalSayiMi;

public class Main {

	public static void main(String[] args) {
		// Sayı asal mı
		int number = 21;
		int counter = 0;

		if (number == 2) {
			System.out.println("2 asal bir sayıdır.");
		} else if (number == 1) {
			System.out.println("1 asal sayı değildir.");
		} else {
			for (int i = 2; i <= number; i++) {
				if (number % i == 0) {
					// bölünebilmeleri sayacak
					counter++;
					if (counter >= 2) {
						break;
					}
				}
			}
			if (counter >= 2) {
				System.out.println(number + " asal sayı değildir.");
			} else {
				System.out.println(number + " asal sayıdır.");
			}
		}
	}
}
