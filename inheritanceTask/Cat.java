package inheritanceTask;

public class Cat extends Animal{
	protected String breed;
	protected int age;

	public Cat(String name, String color, int numberOfLegs, String size, String breed, int age) {
		super(name, color, numberOfLegs, size);
		this.breed = breed;
		this.age = age;
	}
	
	public void meow() {
		super.speak("Meow");
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
