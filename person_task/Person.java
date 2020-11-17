package person_task;

import java.util.ArrayList;

import person_task.Person;

public class Person {
	private String name;
	private int age;
	
	
	public Person() {
		System.out.println("Person Alive!");
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static void init() {
		
		Person bob = new Person("Bob", 25);
		Person barbara = new Person("Barbara", 34);
		
		Person usama = new Person("Usama", 22);
		Person tom = new Person("Tom", 41);
		Person sarah = new Person("Sarah", 26);
		Person alex = new Person("Alex", 19);
		Person mo = new Person("Mo", 25);
		
		ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(bob);
		personList.add(barbara);
		personList.add(usama);
		personList.add(tom);
		personList.add(sarah);
		personList.add(alex);
		personList.add(mo);
		
		for(Person item : personList) {
			System.out.println(item.getName() + " -> " + item.getAge());
		}
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
