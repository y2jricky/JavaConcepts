package com.java.basics;

public class ArrayEnhancedForEachLoop {
	public static void main(String[] args) {
		String student[] = {"Biswajit", "Suman", "Punk", "Cena"};
		System.out.println(student[0]);
		System.out.println(student[1]);
		System.out.println(student[2]);
		System.out.println(student[3]);
		
		System.out.println("Length of my student array is : " +student.length);
		
		for (String reference : student) {
			System.out.println(reference);
		}
	}

}
