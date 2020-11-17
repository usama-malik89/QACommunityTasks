package operators;

public class Ex1_Calculator {
	
	public static void init() {
		
	}
	
	public static Integer sum(int one, int two) {
		return one+two;
	}
	
	public static Integer subtraction(int one, int two) {
		return one-two;
	}
	
	public static Integer times(int one, int two) {
		return one*two;
	}
	
	public static Double div(double one, double two) {
		if(one < two) {
			return one/two;
		}
		System.out.println("First parameter has to be smaller than the second!");
		return null;
	}

}
