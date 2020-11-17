package conditionals;

public class Ex3_Taxes {

	public static void init() {
		method2(63500);
	}
	
	public static double method1(double salary) {
		int taxPercent = 0;
		
		if(salary >= 45000) {
			taxPercent = 25;
		}
		else if(salary >= 30000) {
			taxPercent = 20;
		}
		else if(salary >= 20000) {
			taxPercent = 15;
		}
		
		return taxPercent;
	}
	
	public static double method2(double salary) {
		double totalToPay = salary * (method1(salary)/100); 
		System.out.println("Tax to pay: " + totalToPay);
		return totalToPay;
	}

}
