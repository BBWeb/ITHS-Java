package lesson3;

public class FIncrementOrder {

	public static void main(String[] args) {
		int i = -20, j = 5;
//		System.out.println("i=5, j=5");
		
		// Assign the current value of j to i; then increment j.
		i = j++;
		// Is equivalent to:
		// i = j;
		// j++;
		System.out.println("\ni = j++;");
		System.out.println("i: "+i);
		System.out.println("j: "+j);
		
		
		// Decrement j; then assign the current value of j to i
		i = --j;
		// Is equivalent to:
		// j--;
		// i = j;
		System.out.println("\ni = --j;");
		System.out.println("i: "+i);
		System.out.println("j: "+j);
	}

}
