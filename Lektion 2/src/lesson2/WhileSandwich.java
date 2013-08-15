package lesson2;

public class WhileSandwich {

	public static void main(String[] args) {
		int sandwichSize = 10;

		// Continue looping as long as sandwichSize is greater than 0 
		while (sandwichSize > 0) {
		    System.out.println("Chewing... Current sandwich size: "+sandwichSize);
		    // Decrease sandwichSize by one for each bite 
		    sandwichSize = sandwichSize - 1; 
		}

		// sandwichSize is now 0, since we've exited the loop body 
		System.out.println("All done! Sandwich left: "+sandwichSize);
	}
	
}
