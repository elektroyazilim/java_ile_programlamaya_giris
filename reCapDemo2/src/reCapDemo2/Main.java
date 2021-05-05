package reCapDemo2;

public class Main {

	public static void main(String[] args) {
		// reCap: Dizilerle Çalýþmak

		double[] myList = { 1.2, 1.3, 4.3, 5.6 };
		double max = myList[0];

		for (double number : myList) {
			if (max < number) {
				max = number;
			}
			System.out.println(number);
		}
		System.out.println("Max number : "+ max);
	}
}
