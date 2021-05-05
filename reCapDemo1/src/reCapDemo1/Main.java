package reCapDemo1;

public class Main {

	public static void main(String[] args) {
		int max;
		int a = 98, b= 89, c = 23;

		max = a;
		if (max < b) {
			max = b;
		}
		if (max < c) {
			max = c;
		}
		System.out.println("En büyük sayý "+ max);
	}
}
