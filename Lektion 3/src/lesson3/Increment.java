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
		
		
		// Assign the current value of i to j; then increment i.
		int j = i++;
		// Is equivalent to:
		// int j = i;
		// i++;
		System.out.println("\nint j = i++;");
		System.out.println("i: "+i);
		System.out.println("j: "+j);
		
		
		// Increment i; then assign the current value of i to j
		j = ++i;
		// Is equivalent to:
		// i++;
		// j = i;
		System.out.println("\nj = ++i;");
		System.out.println("i: "+i);
		System.out.println("j: "+j);

	}

}
