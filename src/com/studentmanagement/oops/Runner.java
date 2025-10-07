package com.studentmanagement.oops;

public class Runner {
	public static void main(String[] args) {
//		Student s = new Student("Biswajit", 20, "Kismatpur", "9438065665", 10, 90, 87, 93);
//		Teacher t = new Teacher("Jatin Naveen", 35, "Bangalore", "9986913253", "T101", "Java", 10);
//		Student s2 = new Student("Biswajit", 20, "Kismatpur", "9438065665", 10, 90, 87, 93);
//		Teacher t2 = new Teacher("Jatin Naveen", 35, "Bangalore", "9986913253", "T101", "Java", 10);
//		Student s3 = new Student("Biswajit", 20, "Kismatpur", "9438065665", 10, 90, 87, 93);
//		Teacher t3 = new Teacher("Jatin Naveen", 35, "Bangalore", "9986913253", "T101", "Java", 10);
//		
//		Person p = new Student("Suman", 20, "Hyd", "9999999999", 34, 99, 67, 20);
//		((Student) p).calculateTotalMarks();
//		((Student) p).calculatePercentage();
//		((Student) p).calculateGrade();
//		((Student) p).displayStudentInfo();
//		
//		System.out.println(Student.getTotalStudentCount());
//		System.out.println(Teacher.getTotalTeacherCount());
//		System.out.println(Person.getTotalPersonCount());

		Student s1 = new Student.StudentBuilder("Jatin", 15, "Pune", "9438065665").withRollNumber(20)
				.withMarksObtainedInEnglish(90).withMarksObtainedInMaths(89).withMarksObtainedInScience(56).build();
		s1.displayStudentInfo();

		Student s = new Student.StudentBuilder("Sachin", 15, "Pune", "9438065665").build();
		s.displayStudentInfo();
		
		Student s3 = new Student.StudentBuilder("Ricky", 16, "Dhenkanal", "7887887889").withRollNumber(10)
				.withMarksObtainedInEnglish(78).withMarksObtainedInMaths(87).withMarksObtainedInScience(82).build();
		s3.displayStudentInfo();

		// Checking validations are working or not by passing wrong values

		Student s2 = new Student.StudentBuilder("Suman", 33, "Dhenkanal", "7387543").withRollNumber(300)
				.withMarksObtainedInEnglish(400).withMarksObtainedInMaths(600).withMarksObtainedInScience(899).build();
		s2.displayStudentInfo();
		


	}

}
