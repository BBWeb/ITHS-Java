
public class Exercise9 {

	public static void main(String[] args) {

		// Prints false
		System.out.println(allAreFalse(true, true, true, true));
		// Prints false
		System.out.println(allAreFalse(false, true, false, true));
		// Prints true
		System.out.println(allAreFalse(false, false, false, false));

	}
	
	private static boolean anyIsTrue(boolean b1, boolean b2, boolean b3, boolean b4) {
		return (b1 || b2 || b3 || b4);
	}
	
	private static boolean allAreFalse(boolean b1, boolean b2, boolean b3, boolean b4) {
		boolean result = !anyIsTrue(b1, b2, b3, b4);
		return result;
	}
	
}
