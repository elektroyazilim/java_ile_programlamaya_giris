package mpMukemmelSayi;

public class Main {

	public static void main(String[] args) {
		// Mükemmel Sayý mý?

		int number = 496;
		int sum = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		if (sum == number) {
			System.out.println(number + " mükemmel bir sayýdýr..");
		}
		else {
			System.out.println(number + " mükemmel sayý deðildir.");
		}
	}
}
