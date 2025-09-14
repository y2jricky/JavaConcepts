package com.constructor.concepts;

public class Person {
	private String name;
	private long aadharID;
	private char gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAadharID() {
		return aadharID;
	}

	public void setAadharID(long aadharID) {
		this.aadharID = aadharID;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Person() {
		System.out.println("this is my default constructor");
	}

	public Person(String name) {
		this.name = name;

	}

	public Person(String name, long aadharID, char gender) {
		this.name = name;
		this.aadharID = aadharID;
		this.gender = gender;
	}

}
