package lesson3;

public class BContinue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Looking for all numbers not divisible by 3...");
		int i = 0, numbersFound = 0;
		
		while (i < 100) {
			i = i + 1;
			
			if (i%3 == 0) {
				// If i is divisible by 3, continue to top of loop
				continue;
			}
			
			System.out.println(i);
			numbersFound = numbersFound + 1;
		}
		
		System.out.println("Found "+numbersFound+" numbers!");
		
	}

}
