package conditionals;

public class Ex1_Flowcharts {
	
	public static void init() {
		System.out.println("\nTask1");
		System.out.println(input1 (1, 2, true));	//3
		System.out.println(input1 (3, 3, false));	//9
		System.out.println(input1 (1, 1, true));	//2
		
		input2(2098);
	}
	
	public static int input1(int x, int y, boolean z) {
		if (z) {
			return x + y;
		}
		return x * y;
	}
	
	public static void input2(int a) {
		if (a > 200) {
			System.out.println("A");
			if (a > 6000) {
				System.out.println("C");
			} else {
				System.out.println("B");
				if (a > 4000) {
					System.out.println("D");
				} else {
					System.out.println("E");
				}
			}
		} else {
			System.out.println(1);
			if (a > 100) {
				System.out.println(3);
				if (a > 600) {
					System.out.println(5);
				} else {
					System.out.println(4);
					if (a > 500) {
						System.out.println(6);
					} else {
						System.out.println(7);
					}
				}
			} else {
				System.out.println(2);
			}
		}
	}
	
}
