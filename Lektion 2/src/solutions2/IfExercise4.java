package solutions2;
import java.io.BufferedInputStream;
import java.util.Scanner;


public class IfExercise4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(new BufferedInputStream(System.in));
		System.out.print("Mata in ett tal från 0 till 10: ");
		int number = scanner.nextInt();

		if (number == 0) {
			System.out.println("Noll");
		} else if (number == 1){
			System.out.println("Ett");
		} else if (number == 2){
			System.out.println("Två");
		} else if (number == 3){
			System.out.println("Tre");
		} else if (number == 4){
			System.out.println("Fyra");
		} else if (number == 5){
			System.out.println("Fem");
		} else if (number == 6){
			System.out.println("Sex");
		} else if (number == 7){
			System.out.println("Sju");
		} else if (number == 8){
			System.out.println("Åtta");
		} else if (number == 9){
			System.out.println("Nio");
		} else if (number == 10){
			System.out.println("Tio!");
		} 
		else if (number > 10) {
			System.out.println("För stort tal!");
		}
		
	}

}
