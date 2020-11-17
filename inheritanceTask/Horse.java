package inheritanceTask;

public class Horse extends Animal{
	protected String breed;
	protected int age;

	public Horse(String name, String color, int numberOfLegs, String size, String breed, int age) {
		super(name, color, numberOfLegs, size);
		this.breed = breed;
		this.age = age;
	}
	
	public void neigh() {
		super.speak("Neigh");
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
