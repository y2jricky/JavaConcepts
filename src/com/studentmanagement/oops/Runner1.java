package com.studentmanagement.oops;

public class Runner1 {
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		//s1.name="Suman";
		//s1.age= 32;
		//s1.grade="A";
		//s1.markObtainedInEnglish=100;
		//s1.markObtainedInMaths=99;
		//s1.markObtainedInScience=96;
		//s1.rollNumber=10;
		//System.out.println(s1.name);
		//System.out.println(s1.age);
		//System.out.println(s1.grade);
		//System.out.println(s1.markObtainedInEnglish);
		//System.out.println(s1.markObtainedInMaths);
		//System.out.println(s1.markObtainedInScience);
		//System.out.println(s1.rollNumber);
		s1.calculateTotalMarks();
		
		// As variables in the Student class is private we can't access them directly
		//in the Runner class. We need getter and setters

	}

}
