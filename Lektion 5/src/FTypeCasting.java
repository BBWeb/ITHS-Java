

public class FTypeCasting {

	public static void main(String[] args) {

		divideIntegers();
//		integerCasting();

	}
	
	public static void divideIntegers() {
		// We want to divide two integer values using double division
		int a = 5;
		int b = 2;
		
		// Approach 1:
		// First, convert them to doubles
		double a2 = (double) a; // explicit conversion, "typecasting"
		double b2 = b; // implicit conversion
		// Then, calculate result using our new variables
		double result = a2/b2;
		System.out.println(a2+" / "+b2+" = "+result);
		
		// Approach 2:
		// Convert to doubles by typecasting inline
		result = (double)a/b;
		System.out.println(a+" / "+b+" = "+result);
		// This is the preferred approach,
		// since we don't declare or initiate any additional variables.
		
		// We can cast either number, or both.
		// Double division is invoked as long as any of the arguments is a double
		result = a/(double)b;
		System.out.println(a+" / "+b+" = "+result);

	}

	public static void integerCasting() {
		
		// We may also do the opposite, cast a double to an integer
		double d = 5.5;
		int i = (int)d;
		
		// This may, however, result in loss of data.
		// In this case, the decimal of the double is simply dropped
		System.out.println("i: "+i);
		
	}
}
