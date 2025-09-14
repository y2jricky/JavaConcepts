package com.java.opps;

public class Methods {
	
	int calculateSum (int a, int b) {
		int sum = a+b;
		System.out.println(sum);
		return sum;
	}
	public static void main(String[] args) {
		Methods method = new Methods();
		method.calculateSum(12,25); 
		
	}

}
