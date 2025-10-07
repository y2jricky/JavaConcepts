package com.buildersessions;

public class Runner {
	public static void main(String[] args) {
		//Employee e = new Employee("Jatin", 100, 10000);
		//System.out.println(e);
		
		// Here I had made the constructor as private in Employee class, 
		//hence I can't create Employee class object outside the Employee class
		
		Employee e2 = new Employee.Builder().name("Uday").salary(20000).empId(101).build();
		System.out.println(e2);
	}

}
