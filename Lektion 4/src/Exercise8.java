
public class Exercise8 {

	public static void main(String[] args) {

		// Prints true
		System.out.println(anyIsTrue(true, true, true, true));
		// Prints true
		System.out.println(anyIsTrue(false, true, false, true));
		// Prints false
		System.out.println(anyIsTrue(false, false, false, false));
		

	}
	
	private static boolean anyIsTrue(boolean b1, boolean b2, boolean b3, boolean b4) {
		return (b1 || b2 || b3 || b4);
	}
	
}
