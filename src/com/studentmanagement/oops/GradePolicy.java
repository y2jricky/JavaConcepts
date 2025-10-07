package com.studentmanagement.oops;

public class GradePolicy {

	private static int aPlus;
	private static int aGrade;
	private static int bPlus;
	private static int bGrade;
	private static int cPlus;
	private static int cGrade;
	private static int dPlus;
	private static int dGrade;
	private static int passingMarks;

	static {
		System.out.println("Grade policy loaded in the system");
		aPlus = 95;
		aGrade = 90;
		bPlus = 85;
		bGrade = 80;
		cPlus = 75;
		cGrade = 70;
		dPlus = 65;
		dGrade = 60;
		passingMarks = 33;
	}

	public static String calculateGrade(double percentage) {
		if (percentage >= aPlus) {
			return "A+";
		}
		if (percentage >= aGrade) {
			return "A";
		}
		if (percentage >= bPlus) {
			return "B+";
		}
		if (percentage >= bGrade) {
			return "B";
		}
		if (percentage >= cPlus) {
			return "C+";
		}
		if (percentage >= cGrade) {
			return "C";
		}
		if (percentage >= dPlus) {
			return "D+";
		}
		if (percentage >= dGrade) {
			return "D";
		}
		else{
			return "F";
		}

	}

}
