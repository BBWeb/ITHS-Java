package lesson3;

public class Increment {

	public static void main(String[] args) {

		// initial value is 0
		int i = 0; 
		System.out.println("i: "+i);
		
		
		// increment (= add one)
		i++;
		// i = i + 1;
		System.out.println("\ni++");
		System.out.println("i: "+i);
		
		
		// add 2
		i += 2;
		// i = i + 2;
		System.out.println("\ni += 2;");
		System.out.println("i: "+i);
		
		
		// multiply by 3
		i *= 3;
		// i = i * 3;
		System.out.println("\ni *= 3;");
		System.out.println("i: "+i);

		
		// decrement (= subtract one)
		i--;
		// i = i - 1;
		System.out.println("\ni--;");
		System.out.println("i: "+i);

	}

}
