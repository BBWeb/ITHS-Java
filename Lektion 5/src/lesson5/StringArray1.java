package lesson5;

public class StringArray1 {

	public static void main(String[] args) {
		
		// Create a new String array which can hold three Strings
		String[] names = new String[3];
		
		// Add names to our array
		System.out.println("Saving Kalle, Pelle and Carl to an array");
		names[0] = "Kalle";
		names[1] = "Pelle";
		names[2] = "Carl";
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);

	}

}
