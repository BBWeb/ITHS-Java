

public class CConditionalOne {
	public static void main(String[] args) {
		int x = 6, y = 5;
		
		// Less than or equal
		if(x <= 6) {
			System.out.println("x <= 6");
		} else {
			System.out.println("x > 6");
		}
		
		// Not equal
		if(y != 3) {
			System.out.println("x != 3");
		} else {
			System.out.println("x = 3");
		}
		
		// Greater than or equal
		if(x + y >= 12) {
			// Note that we just performed a calculation within an if clause -
			// We don't need to save the result to a variable
			System.out.println("x + y is greater than or equals 12");
		} else {
			System.out.println("x + y is less than 12");
		}
	}
}
