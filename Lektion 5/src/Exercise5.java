import java.util.Scanner;


public class Exercise5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		// Type casting, explicit type conversion
		//
		// a is converted to double, which in turn
		// prompts java to choose double division
		// instead of integer division.
		double result = (double)a/b;
		
		System.out.println(result);

	}

}
