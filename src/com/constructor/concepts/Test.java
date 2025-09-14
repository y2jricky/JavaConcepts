package com.constructor.concepts;

public class Test {
	public static void main(String[] args) {
		Person p = new Person();
		p.setAadharID(2434234);
		p.setGender('M');
		
		Person p2 = new Person("Suman");
		System.out.println(p2.getName());
		
	}

}
