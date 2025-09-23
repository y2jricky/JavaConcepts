package com.studentmanagement.oops;

public class Runner {
	public static void main(String[] args) {
		Student s = new Student("Biswajit", 19, "GUW", "9438065665", 10, 99, 80, 78);
		//Student p = new Student("Suman", 18, "Test", "9438065665", 23, 45, 67, 78);
		s.displayStudentInfo();
		s.calculateTotalMarks();
		s.calculateTotalMarks();
		s.calculateGrade();
		
		

	}

}
