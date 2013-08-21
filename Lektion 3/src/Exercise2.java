

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Mata in ett tal från 0 till 10: ");
		int number = scanner.nextInt();

		switch (number) {
		
			case 0:
				System.out.println("Noll");
				break;
			case 1:
				System.out.println("Ett");
				break;
			case 2:
				System.out.println("Två");
				break;
			case 3:
				System.out.println("Tre");
				break;
			case 4:
				System.out.println("Fyra");
				break;
			case 5:
				System.out.println("Fem");
				break;
			case 6:
				System.out.println("Sex");
				break;
			case 7:
				System.out.println("Sju");
				break;
			case 8:
				System.out.println("Åtta");
				break;
			case 9:
				System.out.println("Nio");
				break;
			case 10:
				System.out.println("Tio");
				break;
				
			default:
				System.out.println("Felaktigt tal!");

		}

	}

}
