package lesson5;

import java.io.InputStreamReader;
import java.util.Scanner;

public class StringArray2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(new InputStreamReader(System.in));
		System.out.print("How many names do you want to enter? ");
		int size = scanner.nextInt();
		
		// Create new String array, with size specified by user
		String[] names = new String[size];

		for (int i=0; i<names.length; i++) {
			
			// Get a line from user
			String name = scanner.next();			
			// Save it to array on current index
			names[i] = name;

		}
		
		// Print names
		for (int i=0;i<names.length;i++) {
			System.out.println("names["+i+"]: "+names[i]);
		}
	}
}
