package lesson2;

import java.io.InputStreamReader;
import java.util.Scanner;

public class ConditionalOne {
	public static void main(String[] args) {
		int age;
		Scanner scanner = new Scanner(new InputStreamReader(System.in));
		String answer;
		
		System.out.println("Please enter your age: ");
		age = scanner.nextInt(); // Reads an integer from the line
								 // and stores it in the variable
		
		if(age < 18) {
			answer = "You are a child!";
		} else if(age == 43) {
			answer = "UNIX time age!";
		} else if(age > 70) {
			answer = "You are born earlier than 1943";
		} else {
			answer = "You are pretty ordinary when it comes to age";
		}
		
		System.out.println(answer);		
	}
}
