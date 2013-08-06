package lesson3;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		int i = 0;
		
		while(true) { // Loop forever

			System.out.println("i: "+i);
			i = i + 1; // Increment i
			
			// Abort infinite loop after 10 iterations
			if (i >= 10) {
				System.out.println("aborting!");
				break; // "breaks" out of the while loop 
			}
		
		}
		
		System.out.println("Good-bye");
	}
}
