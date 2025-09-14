package com.java.basics;

public class ArrayException {
	public static void main(String[] args) {
		int marks[]= new int[3];
		marks[0]=34;
		marks[1]=344;
		marks[2]=3444;
		
		for (int temp : marks) {
			System.out.println(temp);
		}
		
		System.out.println(marks[2]);
		
		String arr[] = {"Bis","Suman","Punk", "Cena"};
		System.out.println(arr[4]);
	}

}
