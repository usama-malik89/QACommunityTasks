package iteration;

public class Ex1_Flowcharts {

	public static void init() {
		flow1();
		flow2();
		method3();
		method4();
	}
	
	public static void flow1() {
		int a = 100;
		
		while(!(a > 200)) {
			System.out.println(a + " A");
			a++;
		}
	}
	
	public static void flow2() {
		int a = 100;
		
		do {
			if(a%2 == 0) {
				System.out.println("-");
			}
			else {
				System.out.println("*");
			}
			a++;
		} while(a <= 200);
	}
	
	public static void method3() {
		for(int i = 1; i < 11; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.println(i);
			}
		}
	}
	
	public static void method4() {
		for(int i = 1; i < 11; i++) {
			for(int j = 0; j < i; j++) {
				System.out.println(i);
			}
		}
	}

}
