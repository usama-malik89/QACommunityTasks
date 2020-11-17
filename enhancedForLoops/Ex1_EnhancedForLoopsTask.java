package enhancedForLoops;

public class Ex1_EnhancedForLoopsTask {
	public static void init() {
		method4(method2());
	}

	public static void method1() {
		int[] x = { 1, 2, 3, 4, 5, 6, 7, 8 };

		for (int i : x) {
			System.out.println(i);
		}
	}
	
	public static int[] method2() {
		int[] x = new int[20];
		for(int i = 0; i < x.length; i++) {
			x[i] = i+1;
		}
		
		for(int i: x) {
			System.out.println(i*i);
		}
		
		return x;
	}
	
	public static boolean method3(int x) {
		if(x % 2 == 0) {
			return true;
		}
		return false;
	}
	
	
	public static void method4(int[] x) {
		for(int i: x) {
			if(method3(i)) {
				System.out.println(i*i*i);
			}
			else {
				System.out.println(i*i);
			}
		}
	}
}
