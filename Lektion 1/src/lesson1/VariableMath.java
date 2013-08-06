package lesson1;

public class VariableMath {
	
	public static void main(String[] args) {
		int value = 30;
		int secondValue = value / 2;
		int thirdValue = 20, fourthValue, fifthValue;
		
		// Prints: 15
		System.out.println("secondValue = " + secondValue);
		
		// Prints: 35
		fourthValue = secondValue + thirdValue;
		System.out.println("fourthValue = " + fourthValue);
		
		// Prints: ? ;-)
		fifthValue = value * fourthValue - secondValue / thirdValue;
		System.out.println("fifthValue = " + fifthValue);
		
		// Prints: ? ;-)
		fifthValue = value * (fourthValue - secondValue) / thirdValue;
		System.out.println("fifthValue = " + fifthValue);
	}
	
}
