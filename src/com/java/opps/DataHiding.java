package com.java.opps;

public class DataHiding {
	private int a = 10;

	public static void main(String[] args) {
		//System.out.println(a);... can't access a as it is private
		
		DataHiding hide = new DataHiding();
		int b = hide.a;
		System.out.println(b);
		

	}

}
