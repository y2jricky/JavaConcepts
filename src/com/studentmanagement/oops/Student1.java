package com.studentmanagement.oops;

public class Student1 {
	private String name;
	private int age;
	private int rollNumber;
	private double markObtainedInEnglish;
	private double markObtainedInMaths;
	private double markObtainedInScience;
	private String grade;

	public void calculateTotalMarks() {
		double totalmarks = markObtainedInEnglish + markObtainedInMaths + markObtainedInScience;
		double percentage = (markObtainedInEnglish + markObtainedInMaths + markObtainedInScience) / 300 * 100;
		System.out.println("Total marks obtains :" + totalmarks);
		System.out.println("Percentage obtains :" + percentage);
	}

}
