

public class IntArray {

	public static void main(String[] args) {
		
		// Create a new array of size 3, that can hold values of type int
		int[] numbers = new int[3];
		
		// Assign values to the array at position 0, 1 and 2
		System.out.println("Saving 5, 6 and 2 to an array");
		numbers[0] = 5;
		numbers[1] = 6;
		numbers[2] = 2;
		
		System.out.println("First number: "+numbers[0]);
		System.out.println("Second number: "+numbers[1]);
		System.out.println("Third number: "+numbers[2]);
		
		numbers[2] = numbers[0] + numbers[1] + numbers[2];
		System.out.println("\nModified third number. New value: "+numbers[2]);

	}

}
