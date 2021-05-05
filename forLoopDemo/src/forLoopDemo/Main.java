package forLoopDemo;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// for loop
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) {
				System.out.println(i);				
			}			
		}
		System.out.println("for Döngü bitti..");
		
		// while loop
		int i = 1;
		
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("while döngüsü bitti..");
		
		// do-while loop
		i = 0;
		
		do {
			System.out.println(i);
			i+= 2;
		} while (i < 10);
		System.out.println("do while döngüsü bitti.");
	}
}
