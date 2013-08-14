package lesson5;

public class StringArray2 {

	public static void main(String[] args) {
		
		// Create a new String array which can hold five Strings
		String[] names = new String[5];
		
		// Add names to the array at positions 0, 1 and 3 (!)
		System.out.println("Saving Kalle, Pelle and Carl to an array");
		names[0] = "Kalle";
		names[1] = "Pelle";
		names[3] = "Carl";
		
		// Loop through all values of the array
		for (int i = 0; i < names.length; i++) {
			System.out.println(i+". Name: "+names[i]);
		}

	}

}
