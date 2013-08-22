import java.util.Scanner;


public class Exercise7 {

	public static void main(String[] args) {

		
		int a = getInt();
		int b = getInt();
		
		int mean = getMean(a, b);
		System.out.println("mean is "+mean);
	}
	
	private static int getInt() {
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}
	
	private static int getMean(int a, int b) {
		return (a+b)/2 ;
	}

}
