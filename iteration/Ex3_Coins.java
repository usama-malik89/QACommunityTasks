package iteration;

public class Ex3_Coins {
	public static void init() {
		coins(4.58, 20);
	}

	public static void coins(double cost, double change) {
		double x = change - cost;

		int change50 = (int) (x / 50);
		x -= change50 * 50;

		int change20 = (int) (x / 20);
		x -= change20 * 20;

		int change10 = (int) (x / 10);
		x -= change10 * 10;

		int change5 = (int) (x / 5);
		x -= change5 * 5;
		System.out.println(x);

		int change2 = (int) (x / 2);
		x -= change2 * 2;

		int change1 = (int) (x / 1);
		x -= change1;

		int change05 = (int) (x / 0.5);
		x -= change05 * 0.5;

		int change02 = (int) (x / 0.2);
		x -= change02 * 0.2;

		int change01 = (int) (x / 0.1);
		x -= change01 * 0.1;

		int change005 = (int) (x / 0.05);
		x -= change005 * 0.05;

		int change002 = (int) (x / 0.02);
		x -= change002 * 0.02;

		int change001 = (int) (x / 0.01);
		x -= change001 * 0.01;

		if (change50 != 0)
			System.out.println("£50 " + change50);
		if (change20 != 0)
			System.out.println("£20 " + change20);
		if (change10 != 0)
			System.out.println("£10 " + change10);
		if (change5 != 0)
			System.out.println("£5 " + change5);
		if (change2 != 0)
			System.out.println("£2 " + change2);
		if (change1 != 0)
			System.out.println("£1 " + change1);
		if (change05 != 0)
			System.out.println("50p " + change05);
		if (change02 != 0)
			System.out.println("20p " + change02);
		if (change01 != 0)
			System.out.println("10p " + change01);
		if (change005 != 0)
			System.out.println("5p " + change005);
		if (change002 != 0)
			System.out.println("2p " + change002);
		if (change001 != 0)
			System.out.println("1p " + change001);
	}
}
