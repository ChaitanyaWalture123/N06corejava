package org.tnsif.operators;

public class BitwiseOperatorDemo {

	public static void main(String[] args) {
		int x=13,y=9;
		System.out.println(x&y);
		
		System.out.println(x|y);
		System.out.println(x^y);
        //a<<b=a*2^b
		//a<<b=a*2^b
		System.out.println(x<<y);
		
		System.out.println(x>>y);
		
	}

}
