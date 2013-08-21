

import java.io.InputStreamReader;
import java.util.Scanner;

public class BReadInput {
	public static void main(String[] args) {
		
		// Creates the scanner object to read from System.in stream
		Scanner scanner = new Scanner(new InputStreamReader(System.in));
		String input; // Where we are going to save the input
		
		// prints the question without a new line after
		System.out.print("Please enter your name: ");
		
		// Reads from input to the end of the line in the input stream
		input = scanner.nextLine();
		
		// Prints Hello NAME followed by a new line
		System.out.println("Hello " + input);
	}
}
