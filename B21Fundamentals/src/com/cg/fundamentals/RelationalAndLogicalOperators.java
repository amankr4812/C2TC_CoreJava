package com.cg.fundamentals;

import java.util.Random;

public class RelationalAndLogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random =new Random();//classname objname =new classname()
		int i = random.nextInt(100);
		int j = random.nextInt(100);
		System.out.println("i ="+ i);
		System.out.println("j ="+ j);
		System.out.println("i>j " +(i>j));// it will return boolean 
		System.out.println("i<j " +(i<j));
		System.out.println("i<=j " +(i<=j));
		System.out.println("i>=j " +(i>=j));
		System.out.println("i==j " +(i==j));
		System.out.println("i!=j " +(i!=j));
		System.out.println("(i<10)&& (j<10) " +((i<10)&&(j<10)));
		System.out.println("(i<10)|| (j<10) " +((i<10)||(j<10)));

	}

}
