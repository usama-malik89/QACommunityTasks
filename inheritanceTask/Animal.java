package inheritanceTask;

public class Animal {
	protected String name;
	protected String color;
	protected int numberOfLegs;
	protected String size;
	
	public Animal(String name, String color, int numberOfLegs, String size) {
		this.name = name;
		this.color = color;
		this.numberOfLegs = numberOfLegs;
		this.size = size;
	}
	
	public void speak(String msg) {
		System.out.println(this.name + " says: " + "\"" + msg + "\"");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	
}
