
public class Exercise6 {

	public static void main(String[] args) {

		System.out.println(isEven(2)); // true
		System.out.println(isEven(10));// true
		System.out.println(isEven(9)); // false

	}
	
	private static boolean isEven(int i) {
		return (i%2 == 0);
	}

}
