package lesson3;

import java.io.InputStreamReader;
import java.util.Scanner;

public class DSwitch {

	public static void main(String[] args) {

		System.out.println("Welcome to The Application!");
		System.out.println("Please choose what you want to do.\n");
		System.out.println("0. Home");
		System.out.println("1. Information");
		System.out.println("2. More Information");
		System.out.print("Enter choice: ");

		// Create scanner object, and read an integer from user
		Scanner scanner = new Scanner(new InputStreamReader(System.in));
		int input = scanner.nextInt();
		System.out.println(); // print an empty line
		
		// Look at the variable input to determine what code gets executed  
		switch (input) {

			case 0: // In case input == 0
				System.out.println("Welcome home!");
				break; // we're finished, break out of switch case 

			case 1: // In case input == 1
				System.out.println("You chose Information.");
				break;

			case 2: // In case input == 2
				System.out.println("You chose More Information. Too bad, I have no more information!");
				break;

			default: // In case none of the above cases are true
				System.out.println("Invalid choice!");
				break;
		}

	}

}
