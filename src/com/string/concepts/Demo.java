package com.string.concepts;

public class Demo {
	public static void main(String[] args) {

		String s1 = "biswajit";
		String s2 = "biswajit";
		System.out.println("S1 hashcode is : " + s1.hashCode());
		System.out.println("S2 hashcode is : " + s2.hashCode());
		System.out.println(s1 == s2);

		String s3 = "World";
		String s4 = "World".intern();
		System.out.println(s4);
		System.out.println("S3 hashcode is : " + s3.hashCode());
		System.out.println("S4 hashcode is : " + s4.hashCode());
		System.out.println(s3 == s4);

		String s5 = "Test";
		String s6 = "Te" + "st";
		System.out.println("S5 hashcode is : " + s5.hashCode());
		System.out.println("S6 hashcode is : " + s6.hashCode());
		System.out.println(s5 == s6);

		String part1 = "Te";
		String part2 = "st";
		String s7 = "Test";
		String s8 = part1 + part2;
		System.out.println("S7 hashcode is : " + s7.hashCode());
		System.out.println("S8 hashcode is : " + s8.hashCode());
		System.out.println(s7 == s8);

	}

}
