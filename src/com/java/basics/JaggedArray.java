package com.java.basics;

public class JaggedArray {
	public static void main(String[] args) {
		int x[][] = new int[3][];
		x[0] = new int[] { 34, 89, 78 };
		x[1] = new int[] { 100, 809, 78, 700 };
		x[2] = new int[] { 2 };

		System.out.println("length of row is : " + x.length);

		for (int rowIndex = 0; rowIndex < x.length; rowIndex++) {
			for (int colIndex = 0; colIndex < x[rowIndex].length; colIndex++) {
				System.out.print(x[rowIndex][colIndex] + " ");

			}
			System.out.println("");

		}
	}

}
