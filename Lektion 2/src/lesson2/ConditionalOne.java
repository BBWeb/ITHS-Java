package lesson2;

import java.io.InputStreamReader;
import java.util.Scanner;

public class ConditionalOne {
	public static void main(String[] args) {
		int age;
		Scanner scanner = new Scanner(new InputStreamReader(System.in));
		String answer;
		
		System.out.println("Please enter you age: ");
		age = scanner.nextInt(); // Reads an integer from the line
		
		if(age < 18) { // if age is < 18
			answer = "You are a child!";
		} else if(age > 70) { // if age is 
			answer = "You are born earlier than 1943";
		} else {
			answer = "You remember the old days";
		}
		
		System.out.println(answer);
		
	}
}
