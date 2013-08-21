
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Mata in din poäng: ");
		int score = scanner.nextInt();

		if (score >= 50) {
			System.out.println("Godkänt!");
		} else {
			System.out.println("Underkänt.");
		}
		
	}

}
