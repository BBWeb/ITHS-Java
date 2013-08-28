

import java.io.InputStreamReader;
import java.util.Scanner;

public class ABreak {

	public static void main(String[] args) {
		int i = 0;
		
		while(true) { // Loop forever

			System.out.println("i: "+i);
			i = i + 1; // Increment i
			
			// After 10 iterations, abort infinite loop
			if (i >= 10) {
				System.out.println("aborting!");
				 
			}
		
		}
		
	}
}
