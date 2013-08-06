package lesson5;

public class Types {

	public static void main(String[] args) {
		
		// Add two double values
		double a1 = 0.5;
		double b1 = 25.2;
		double result1 = a1+b1; // = 25.7
		System.out.println(a1+" + "+b1+" = "+result1);
		
		// Divide two integer values, store result in int
		int a2 = 5;
		int b2 = 2;
		double result2 = a2 / b2; // = 2
		// Integers do not handle decimals, so they are simply ignored
		System.out.println(a2+" / "+b2+" = "+result2);
		
		// Divide two integer values, store result in double
		int a3 = 5;
		int b3 = 2;
		double result3 = a3 / b3; // = 2.0
		System.out.println(a3+" / "+b3+" = "+result3);

		// Uh oh! 5/2 is not equal to 2!
		// This result is obtained since we java thinks we want to
		// perform integer division, since both of our numbers are integers.
		
		// Dividing two double values works as expected:
		double a4 = 5.0;
		double b4 = 2.0;
		double result4 = a4 / b4; // is equal to 2.5
		System.out.println(a4+" / "+b4+" = "+result4);

		// ... How do we divide two integers?
		int a5 = 5;
		int b5 = 2;
		double result5 = 5/2;
	}

}
