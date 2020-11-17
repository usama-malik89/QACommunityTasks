package arraysTask;

public class Ex1_ArrayTask {
	public static void init() {
		method2();
	}

	public static void method1() {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void method2() {
		int[] a = new int[10];

		for (int i = 0; i < a.length; i++) {
			a[i] = i;
			System.out.println(a[i]);
		}
		
		for (int i = 0; i < a.length; i++) {
			a[i] = a[i]*10;
			System.out.println(a[i]);
		}
	}
}
