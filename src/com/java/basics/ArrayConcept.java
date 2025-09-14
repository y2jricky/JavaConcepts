package com.java.basics;

public class ArrayConcept {
	public static void main(String[] args) {
		int x = 10;
		int marks[]= new int[5];
		System.out.println(x);//10
		System.out.println(marks);//Will print hashcode
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		
		for(int index=0; index<=4; index++) {
			System.out.println(marks[index]);
		}
		
		System.out.println("My array length is : " +marks.length);
		
		
		for(int index=0; index<=marks.length-1; index++) {
			System.out.println(marks[index]);
		}
	}

}
