package org.tnsif.decisionmaking;

import java.util.Scanner;

//program to demonstrate on to check the person is eligible to donate bloo or not

public class IfElaseExecutere {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		int weight=sc.nextInt();
		if(age>=18 && weight>=50) {
			System.out.println("Eligible to donate the blood");
		}
		else {
			System.out.println("you are not Eligible to donate  blood");
		}

	}

}
