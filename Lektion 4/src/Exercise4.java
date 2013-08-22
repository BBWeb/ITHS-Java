import java.util.Scanner;


public class Exercise4 {

	public static void main(String[] args) {

		add(2, 5); // should print 7
		add(6, 6); // should print 12
		add(1, 1); // should print 2

	}
	
	private static void add(int a, int b) {
		int result = a + b;
		System.out.println(result);
	}

}
