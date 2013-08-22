

import java.io.InputStreamReader;
import java.util.Scanner;

public class MathProgramWithMethods {
	
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		int x, y, answer = 0;
		char operator;
		
		System.out.println("Welcome to our (improved) math program!");
		
		x = readInteger("Enter a first number: ");
		operator = readChar("Enter an operator(+ - * or /): ");
		y = readInteger("Enter a second number");
		
		if(operator == '+') {
			answer = add(x,y);
		} else if(operator == '-') {
			answer = subtract(x,y);
		} else if(operator == '/') {
			answer = divide(x,y);
		} else if(operator == '*') {
			answer = multiply(x,y);
		}
		
		System.out.println("The result is " + answer);
		
	}
	
	/**
	 * Reads an integer from the command line
	 * @param message Message to print
	 * @return the read integer
	 */
	private static int readInteger(String message) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(message);
		return scanner.nextInt();
	}

	/**
	 * Reads a char from the command line
	 * @param message Message to print
	 * @return
	 */
	private static char readChar(String message) {
		Scanner scanner = new Scanner(new InputStreamReader(System.in));
		System.out.println(message);
		return scanner.next().charAt(0);
	}
	
	/**
	 * Multiplies two variables
	 * @param x
	 * @param y
	 * @return
	 */
	private static int multiply(int x, int y) {
		return x * y;
	}

	/**
	 * Divides variable x with y
	 * @param x
	 * @param y
	 * @return
	 */
	private static int divide(int x, int y) {
		return x * y;
	}

	/**
	 * Subtracts variable y from x
	 * @param x
	 * @param y
	 * @return
	 */
	private static int subtract(int x, int y) {
		return x - y;
	}

	/**
	 * Adds two variables
	 * @param x
	 * @param y
	 * @return
	 */
	private static int add(int x, int y) {
		return x + y;
	}
	
}
