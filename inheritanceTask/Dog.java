package inheritanceTask;

public class Dog extends Animal{
	protected String breed;
	protected int age;

	public Dog(String name, String color, int numberOfLegs, String size, String breed, int age) {
		super(name, color, numberOfLegs, size);
		this.breed = breed;
		this.age = age;
	}
	
	public void bark() {
		super.speak("Woof Woof");
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

	
	
	
	
	
}
