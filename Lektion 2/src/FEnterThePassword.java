

import java.io.InputStreamReader;
import java.util.Scanner;

public class FEnterThePassword {
	public static void main(String[] args) {
		String password = "ITHS", input = "";
		Scanner scanner = new Scanner(new InputStreamReader(System.in));
		
		// As long as the entered password is incorrect, we will repeat it
		while(!input.equals(password)) {
			System.out.print("Please enter the password:" );
			input = scanner.nextLine();
		}
		
		System.out.println("Correct password!!");
	}
}
