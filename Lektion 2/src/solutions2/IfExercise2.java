package solutions2;
import java.io.BufferedInputStream;
import java.util.Scanner;


public class IfExercise2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(new BufferedInputStream(System.in));
		System.out.print("Mata in din po�ng: ");
		int score = scanner.nextInt();

		if (score >= 50) {
			System.out.println("Godk�nt!");
		} else {
			System.out.println("Underk�nt.");
		}
		
	}

}
