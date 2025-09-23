package com.oops.concepts;

import com.studentmanagement.oops.Teacher;

public class Runner {
	public static void main(String[] args) {
		Student s = new Student("Biswajit", 18, "Hyderabad", "9438065665", 34, 99, 91, 89);
		s.calculateTotalMarks();
		s.calculatePercentage();
		s.calculateGrade();
		s.displayStudentInfo();
		
		
		Student s1 = new Student("Raj",20,"Kolkata", "9986913252", 10, 22, 22, 34);
		s1.calculateTotalMarks();
		s1.calculatePercentage();
		s1.calculateGrade();
		s1.displayStudentInfo();
		
		Teacher t = new Teacher("jatin", 33, "Pune", "8778432432", "T110", "Java", 10);
		t.displayTeacherInfo();
		


	}

}
