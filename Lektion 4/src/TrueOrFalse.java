

public class TrueOrFalse {
	public static void main(String[] args) {
		boolean weAreAtITHS = true;
		boolean weLikeProgramming = true;
		boolean weAreFromOuterSpace = false;
		boolean weAreFromEarth = !weAreFromOuterSpace;
		
		if(weAreAtITHS) {
			System.out.println("We are at ITHS! :)");
		} else {
			System.out.println("We are not at ITHS :(");
		}
		
		if(weLikeProgramming) {
			System.out.println("We like to program!");
		} else {
			System.out.println("We don't like to program!");
		}
		
		if(weAreAtITHS && weLikeProgramming) {
			System.out.println("We like where we are and we like what we do");
		}
		
		if(weAreFromOuterSpace && weAreFromEarth) {
			System.out.println("This will NEVER happen!");
		}
		
		if( !(weAreFromOuterSpace && weAreFromEarth) ) {
			System.out.println("This will ALWAYS happen");
		}
		
		if(weAreFromOuterSpace || weAreFromEarth) {
			System.out.println("We are from somewhere in the Universe obviously");
		}
	
	}
}
