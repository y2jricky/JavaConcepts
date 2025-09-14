package com.java.opps;

public class OverLoading {
	public static void main(String[] args) {
		/*
		 * int a =10; int b=20; int c=30; sum(a, b); sum(a, b, c);
		 */
		
		sum(10, 20);
		sum(22222, 90230432, 343);
		
	}
	
	public static void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}

}
