package com.staticconcepts;

import java.util.Objects;

public class Employee {
	private String name;
	public static String companyName;

	static {
		companyName = "Cyient";
		System.out.println("I am the static block");

	}
	static {
		System.out.println("I am the static block 2");

	}
	static {
		System.out.println("I am the static block returns");

	}

	public Employee(String name) {
		super();
		this.name = name;
		companyName = "Cubic";
		System.out.println("I am the consctructor");
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(name, other.name);
	}

}
