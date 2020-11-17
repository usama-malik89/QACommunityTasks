package com.qa.qacommunity;

import arraysTask.*;
import conditionals.*;
import enhancedForLoops.*;
import inheritanceTask.*;
import iteration.*;
import operators.Ex1_Calculator;
import operators.Ex2_Result;
import person_task.Person;

public class Runner {

	public static void main(String[] args) {
		Dog lassie = new Dog("Lassie", "Brown", 4, "Medium", "Rough Collie", 10);
		lassie.bark();
		
		Cat garfield = new Cat("Garfield", "Orange", 4, "Medium", "Persian Cat", 5);
		garfield.meow();
		
		Horse secretariat = new Horse("Secretariat", "Dark Brown", 4, "Large", "American Thoroughbred", 20);
		secretariat.neigh();
		
	}

}
