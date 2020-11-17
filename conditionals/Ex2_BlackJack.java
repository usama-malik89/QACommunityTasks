package conditionals;

public class Ex2_BlackJack {

	public static void init() {
		System.out.println(blackJack(10, 21));	//21
		System.out.println(blackJack(20, 18));	//20
		System.out.println(blackJack(1, 22));	//1
		System.out.println(blackJack(22, 23));	//0
	}
	
	public static int blackJack(int x, int y) {
		if(x > y && x <= 21 && x > 0) {
			return x;
		} else if(y <= 21) {
			return y;
		}
			
		
		if(y > x && y <= 21 && y > 0) {
			return y;
		} else if(x <= 21) {
			return x;
		}
		
		return 0;
	}

}
