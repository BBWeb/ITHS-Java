package lesson4;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Method {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Get input from user
		Scanner scanner = new Scanner(new InputStreamReader(System.in));
		System.out.print("Are you feeling adventurous? ");
		String answer = scanner.nextLine();

		if (answer.equals("yes")) {
			// Call the travelTheWorld()-method
			travelTheWorld();
		} else {
			// Call the takeANap()-method
			takeANap();
		}
	}
	
	// Declare a new method
	public static void travelTheWorld() {
		// The code to be run when this method is called
		System.out.println("Oh boy! Thailand sure is cheap!");
	}
	
	// Declare yet another method
	public static void takeANap() {
		// The code to be run when this method is called
		System.out.println("That's all right then, take a nap.");
	}

}
