package com.java.basics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Important {
	public static void main(String[] args) {
		int a[] = new int[5];
		a[0] = 34;
		a[1] = 56;
		a[2] = 43;
		a[3] = 666;
		a[4] = 675;

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}

		for (int temp : a) {
			System.out.println(temp);

		}

		System.out.println(Arrays.toString(a));

		int b[][] = new int[2][2];
		b[0][0] = 345;
		b[0][1] = 234;
		b[1][0] = 4523;
		b[1][1] = 12412;
		System.out.println(b[0][0]);
		System.out.println(b[0][1]);
		System.out.println(b[1][0]);
		System.out.println(b[1][1]);
		System.out.println(Arrays.toString(b[0]));
		System.out.println(Arrays.toString(b[1]));

	}

}
