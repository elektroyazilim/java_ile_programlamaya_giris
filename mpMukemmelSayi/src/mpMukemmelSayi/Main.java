package mpMukemmelSayi;

public class Main {

	public static void main(String[] args) {
		// M�kemmel Say� m�?

		int number = 496;
		int sum = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		if (sum == number) {
			System.out.println(number + " m�kemmel bir say�d�r..");
		}
		else {
			System.out.println(number + " m�kemmel say� de�ildir.");
		}
	}
}
