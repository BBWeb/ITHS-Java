import java.util.Scanner;


public class Exercise3 {

	public static void main(String[] args) {

		// We need one boolean for each question
		boolean answer1, answer2, answer3;
		String answer;
		
		// Create scanner
		Scanner input = new Scanner(System.in);
		
		// Ask first question
		System.out.print("Yes or no?");
		answer = input.nextLine();
		// If user enters "yes" the answer is true, otherwise false
		answer1  = answer.equals("yes"); 

		// Ask second question
		System.out.print("No or yes?");
		answer = input.nextLine();
		answer2  = answer.equals("yes"); 

		// Ask third question
		System.out.print("Yes or no or yes?");
		answer = input.nextLine();
		answer3  = answer.equals("yes"); 

		// If all answers are correct
		if (answer1 && answer2 && answer3) {
			System.out.println("Congratulations!");
		}
		// If none of the answers are correct
		else if (!answer1 && !answer2 && !answer3) {
			System.out.println("boo");
		}
		// Else, some of the answers must be correct
		else {
			System.out.println("Good enough");
		}

		
	}

}
