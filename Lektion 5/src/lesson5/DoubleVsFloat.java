package lesson5;

public class DoubleVsFloat {

	public static void main(String[] args) {

		// Add two double values
        double a = 99999.8d;
        double b = 99999.65d;
        double result = a + b;
        System.out.println("double: "+ result);

        // Add two float values
        float a2 = 99999.8f;
        float b2 = 99999.65f;
        float result2 = a2 + b2;
        System.out.println("float: "+ result2);

        // Why does the result differ?
	}

}
