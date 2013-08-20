package lesson3;

public class GFor {

	public static void main(String[] args) {
		
		System.out.println("First loop:");
		// Loop exactly 10 times
		for (int i=0; i < 10; i++) {		
			System.out.println("i: "+i);
		}

		System.out.println("\nSecond loop:");
		// This loop is equivalent to the above one
		int i = 0;
		for (; i < 10; i++) {
			System.out.println("i: "+i);
		}

		System.out.println("\nThird loop:");
		// ... And so is this
		i = 0;
		for (; i < 10;) {
			System.out.println("i: "+i);
			i++;
		}
		
		// This will loop infinitely
//		for (;;) {
//			System.out.println("Can anyone hear me?");
//			break; // break works here as well!
//		}
		
	}
}
