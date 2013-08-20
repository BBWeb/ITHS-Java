package solutions2;
import java.io.BufferedInputStream;
import java.util.Scanner;


public class IfExercise3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(new BufferedInputStream(System.in));
		System.out.print("Mata in ett tal: ");
		int number = scanner.nextInt();

		if (number%2 == 0) {
			System.out.println("Ditt tal är jämnt.");
		} else {
			System.out.println("Ditt tal är udda.");
		}
		
	}

}
