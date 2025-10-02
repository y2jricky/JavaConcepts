package com.studentmanagement.oops;

public class Runner {
	public static void main(String[] args) {
		Student s = new Student("Biswajit", 10, "Hyderabad", "9438065665", 45, 67, 89, 100);
		s.calculateTotalMarks();
		s.calculatePercentage();
		s.calculateGrade();
		s.displayStudentInfo();

		

	}

}
