package lesson3;

import java.io.InputStreamReader;
import java.util.Scanner;

public class CDoWhile {

	public static void main(String[] args) {

		// Create scanner for fetching input
		Scanner scanner = new Scanner(System.in);
		int input;

		do {
			System.out.print("Enter a number (>=10 to exit): ");
			// Get a number from user
			input = scanner.nextInt();
			System.out.println("Your number times two is "+(input*2)+"!");
		}
		// Continue looping as long as this is true
		while (input < 10);
		
	}

}
