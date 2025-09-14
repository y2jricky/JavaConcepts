package com.studentmanagement.oops;

public class Runner {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setAge(3);
		s1.setName("Biswajit");
		
		System.out.println(s1.getAge());
		System.out.println(s1.getName());
		
		s1.calculateTotalMarks();
	}

}
