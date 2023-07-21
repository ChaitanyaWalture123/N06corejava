package org.tnsif.operators;

public class IncrementDecrementOperator {

	public static void main(String[] args) {
		int x=23;
		int y=6;
		int resl1=x++ + ++y;
		System.out.println("result 1 variable");
		System.out.println(resl1);
		System.out.println(x);
		System.out.println(y);
		System.out.println("result 2 variable");
		int resl2=x-- + --y;
		System.out.println(resl2);
		System.out.println(x);
		System.out.println(y);
	}

}
