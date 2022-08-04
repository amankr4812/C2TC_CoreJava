package com.cg.fundamentals;

public class Scope {

	public static void main(String[] args) {
		int outer =1;
		{
			int inner =2;
			System.out.println("outer =" + outer);
			System.out.println("inner =" + inner);
	
		}
		int inner = 3;
		System.out.println("outer =" + outer);
		System.out.println("inner =" + inner);
		

	}

}
