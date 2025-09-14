package com.java.basics;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		int a [][] = new int [3][2];
		a[0][0] = 10;
		a[0][1] = 20;
		a[1][0] = 30;
		a[1][1] = 40;
		a[2][0] = 50;
		a[2][1] = 60;
		
		for (int rowIndex=0; rowIndex<=2; rowIndex++) {
			for (int columnIndex=0; columnIndex<=1; columnIndex++ ) {
				System.out.println(a[rowIndex][columnIndex]);
			}
		}
	}

}
