package lesson4;

import java.io.InputStreamReader;
import java.util.Scanner;

public class MathProgramWithoutMethods {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x, y, answer = 0;
		char operator;
		
		System.out.println("Welcome to our math program!");
		System.out.println("Enter a first number: ");
		x = scanner.nextInt();
		
		System.out.println("Enter an operator(+ - * or /): ");
		operator = scanner.next().charAt(0);
		
		System.out.println("Enter a second number:" );
		y = scanner.nextInt();
		
		if(operator == '+') {
			answer = x + y;
		} else if(operator == '-') {
			answer = x - y;
		} else if(operator == '/') {
			answer = x / y;
		} else if(operator == '*') {
			answer = x * y;
		}
		
		System.out.println("The result is " + answer);
		
	}
	
}
