package conditionals;

public class Ex4_Numbers {

	public static void init() {
		method1(26);
	}
	
	public static void method1(int x) {
		String y = Integer.toString(x);
		int digit1 = Integer.parseInt(y.substring(0,1));
		int digit2 = Integer.parseInt(y.substring(1,2));
		System.out.println(digit1+digit2);
	}
	
	public static void method2(int x) {
		//not able to finish
	}

}
