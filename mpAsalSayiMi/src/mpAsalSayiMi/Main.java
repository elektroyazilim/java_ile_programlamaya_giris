package mpAsalSayiMi;

public class Main {

	public static void main(String[] args) {
		// Say� asal m�
		int number = 21;
		int counter = 0;

		if (number == 2) {
			System.out.println("2 asal bir say�d�r.");
		} else if (number == 1) {
			System.out.println("1 asal say� de�ildir.");
		} else {
			for (int i = 2; i <= number; i++) {
				if (number % i == 0) {
					// b�l�nebilmeleri sayacak
					counter++;
					if (counter >= 2) {
						break;
					}
				}
			}
			if (counter >= 2) {
				System.out.println(number + " asal say� de�ildir.");
			} else {
				System.out.println(number + " asal say�d�r.");
			}
		}
	}
}
