package com.constructor.concepts;

public class Test {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("Raj");
		p1.setId(20);
		
		Person p = new Person("Ricky", 20);
		
		Person copyPerson = new Person(p);
		
		
		
		
	}

}
