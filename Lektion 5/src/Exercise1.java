import java.util.Scanner;


public class Exercise1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] numbers = new int[5];
		int sum = 0;
		
		// Get numbers from user and calculate sum
		System.out.println("Please enter 5 numbers:");
		for (int i = 0; i < 5; i++) {
			numbers[i] = input.nextInt();
			sum += numbers[i];
		}
		
		// Print numbers and sum
		System.out.println("Tal:");
		for (int i = 0; i < 5; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("Summa: "+sum);

	}

}
