package com.cg.fundamentals;

public class BitWish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i ;
		int num =16;
		for(i =0;i<4;i++) {
			num = num<<1;  //leftshift  16<< --> 10000 --->100000
			System.out.println(num);
		}

	}

}
