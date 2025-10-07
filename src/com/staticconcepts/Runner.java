package com.staticconcepts;

public class Runner {
	public static void main(String[] args) {
		System.out.println(Employee.companyName);
		Employee e = new Employee("Raj");
		Employee e2 = new Employee("Uday");
		Employee e3 = new Employee("Vijay");
		Employee e4 = new Employee("nandesh");
		Employee e5 = new Employee("Idly");
		Employee e6= new Employee("Dosa");
		
		System.out.println(e);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e5);
		System.out.println(e6);
		
		System.out.println(Employee.companyName);
		System.out.println(Employee.companyName);
		System.out.println(Employee.companyName);
		System.out.println(Employee.companyName);
		System.out.println(Employee.companyName);
		System.out.println(Employee.companyName);
		
	}

}
