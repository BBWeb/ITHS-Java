package excercise1;

public class Excercise5 {

	public static void main(String[] args) {

		int a = 5;
		int b = 7;
		System.out.println("a="+a+", b="+b);
		
		// Use a temporary variable 'temp' for transferring of values
		int temp = a; 
		a = b;
		b = temp;

		System.out.println("a="+a+", b="+b);

	}
	
}