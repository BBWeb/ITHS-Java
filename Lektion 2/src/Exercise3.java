
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Mata in ett tal: ");
		int number = scanner.nextInt();

		if (number%2 == 0) {
			System.out.println("Ditt tal �r j�mnt.");
		} else {
			System.out.println("Ditt tal �r udda.");
		}
		
	}

}
