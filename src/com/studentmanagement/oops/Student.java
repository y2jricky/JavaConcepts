package com.studentmanagement.oops;

public class Student {
	private String name;
	private int age;
	private int rollNumber;
	private double markObtainedInEnglish;
	private double markObtainedInMaths;
	private double markObtainedInScience;
	private String grade;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() >= 0) {
			this.name = name;
		} else {
			System.out.println("Invalid name");
		}
	}

	public int getAge() {
		return age;

	}

	public void setAge(int age) {
		if (age >= 10 && age <= 25) {
			this.age = age;
		} else {
			System.out.println("Invalid age");
		}
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		if (rollNumber >= 1) {
			this.rollNumber = rollNumber;
		} else {
			System.out.println("Rollnumber is invalid");
		}
	}

	public double getMarkObtainedInEnglish() {
		return markObtainedInEnglish;
	}

	public void setMarkObtainedInEnglish(double markObtainedInEnglish) {
		this.markObtainedInEnglish = markObtainedInEnglish;
	}

	public double getMarkObtainedInMaths() {
		return markObtainedInMaths;
	}

	public void setMarkObtainedInMaths(double markObtainedInMaths) {
		this.markObtainedInMaths = markObtainedInMaths;
	}

	public double getMarkObtainedInScience() {
		return markObtainedInScience;
	}

	public void setMarkObtainedInScience(double markObtainedInScience) {
		this.markObtainedInScience = markObtainedInScience;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void calculateTotalMarks() {
		double totalmarks = markObtainedInEnglish + markObtainedInMaths + markObtainedInScience;
		double percentage = (markObtainedInEnglish + markObtainedInMaths + markObtainedInScience) / 300 * 100;
		System.out.println("Total marks obtains :" + totalmarks);
		System.out.println("Percentage obtains :" + percentage);
	}

}
