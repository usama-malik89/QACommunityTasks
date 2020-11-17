package operators;

public class Ex2_Result {
	int physics;
	int chemistry;
	int biology;
	int total;
	int percentage;
	
	public Ex2_Result(int p, int c, int b) {
		this.physics = p;
		this.chemistry = c;
		this.biology = b;
		this.total = p + c + b;
	}
	
	public static void init() {
		Ex2_Result x = new Ex2_Result(100,120,70);
		//x.method1();
		x.method2();
	}
	
	public void method1() {
		total = physics + chemistry + biology;
		System.out.println("+---------------------+");
		System.out.println("| Results             |");
		System.out.println("+-----------+---------+");
		
		System.out.println("| Physics   |  " + physics + (" ".repeat(space(physics))) + "|");
		System.out.println("| Chemistry |  " + chemistry + (" ".repeat(space(chemistry))) + "|");
		System.out.println("| Biology   |  " + biology + (" ".repeat(space(biology)))     + "|");

		System.out.println("+-----------+---------+");
		System.out.println("| Total        " + total + (" ".repeat(space(total)))     + "|");
		System.out.println("+---------------------+");
		System.out.println("\n");
	}
	
	public void method2() {
		percentage = (total*100)/450;
		int pass = 60;
		String physicsGrade = "Pass";
		String chemistryGrade = "Pass";
		String biologyGrade = "Pass";
		String overallGrade = "Pass";
		if(percentage < pass || (physics*100)/150 < pass || (biology*100)/150 < pass || (chemistry*100)/150 < pass) {
			overallGrade = "Fail";
		}
		if((physics*100)/150 < pass) {
			physicsGrade = "Fail";
		}
		if((chemistry*100)/150 < pass) {
			chemistryGrade = "Fail";
		}
		if((biology*100)/150 < pass) {
			biologyGrade = "Fail";
		}
		
		System.out.println("+-------------------------+");
		System.out.println("| Grade                   |");
		System.out.println("+---------------+---------+");
		
		System.out.println("| Total %       |  " + percentage + (" ".repeat(space(percentage))) + "|");
		System.out.println("| Physics       |  " + physicsGrade + (" ".repeat(space(physicsGrade))) + "|");
		System.out.println("| Chemistry     |  " + chemistryGrade + (" ".repeat(space(chemistryGrade))) + "|");
		System.out.println("| Biology       |  " + biologyGrade + (" ".repeat(space(biologyGrade)))     + "|");
		System.out.println("| Overall Grade |  " + overallGrade + (" ".repeat(space(overallGrade))) + "|");

		System.out.println("+---------------+---------+");
		
		
	}
	
	public Integer space(int x) {
		int length = String.valueOf(x).length();
		int totalLength = 7;
		if((totalLength - length) < 0) {
			return 0;
		}
		return totalLength - length;
	}
	
	public Integer space(String x) {
		int length = x.length();
		int totalLength = 7;
		if((totalLength - length) < 0) {
			return 0;
		}
		return totalLength - length;
	}

}
