import java.util.Scanner;


public class Exercise5 {

	public static void main(String[] args) {

		int result1 = add(2, 5);
		int result2 = add(6, 6);
		int result3 = add(1, 1);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}
	
	private static int add(int a, int b) {
		int result = a + b;
		return result;
	}

}
