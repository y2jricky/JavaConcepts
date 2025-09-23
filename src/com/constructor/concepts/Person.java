package com.constructor.concepts;

public class Person {
	private String name;
	private int id;

	public Person() {
		System.out.println("This is my default constrcutor");

	}

	public Person(String name, int id) {
		this();// constructor chaining
		System.out.println("This is my parametrized constrcutor");
		this.name = name;
		this.id = id;

	}

	public Person(Person other) {
		System.out.println("This is my copy constrcutor");
		this.name = other.name;
		this.id = other.id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
