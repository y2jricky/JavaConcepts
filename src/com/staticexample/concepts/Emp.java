package com.staticexample.concepts;

public class Emp {
	private String name;
	public static String companyName;
	
	
	public Emp(String name) {
		super();
		this.name = name;
		System.out.println("This is my constructor");
	}
	
	static {
		//This is my static block
		companyName="Cubic";
		System.out.println("This is my static block 1");
		
		
	}
	static {
		//This is my static block
		companyName="Cyient";
		System.out.println("This is my static block 2");
		
		
	}
	static {
		//This is my static block
		companyName="ZenQ";
		System.out.println("This is my static block 3");
		
		
	}
	
	
	
	
	

}
