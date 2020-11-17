package iteration;

public class Ex4_StringManipulation {

	public static void init() {
		// System.out.println(method1("Usama Malik is my name"));
		method2("Usama Malik is my name");
	}

	public static int method1(String str) {
		int count = 1;

		for (int i = 0; i < str.length(); i++) {
			if (str.substring(i, i + 1).equals(" ")) {
				count++;
			}
		}
		return count;
	}

	public static void method2(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.substring(i, i + 1).equals(" ")) {
				System.out.println("");
				continue;
			}
			System.out.print(str.substring(i, i + 1));
		}
	}
	
	public static void method3(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.substring(i, i + 1).equals(" ")) {
				System.out.println("");
				continue;
			}
			System.out.print(str.substring(i, i + 1));
		}
	}
}
