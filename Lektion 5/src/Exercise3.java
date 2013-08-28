import java.util.Scanner;


public class Exercise3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("How many numbers?");
		int count = input.nextInt();
		
		int[] numbers = new int[count];
		int sum = 0;

		// keeps track of whether we should count the
		// next number as positive or negative
		boolean minus = false;
		
		// Get numbers from user and calculate sum
		System.out.println("Please enter "+count+" numbers:");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
			
			if (minus) {
				sum -= numbers[i];
			} else {
				sum += numbers[i];
			}
			// change value of boolean 
			minus = !minus;
			
		}
		
		// Print numbers and sum
		System.out.println("Tal:");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("Summa: "+sum);

	}

}
