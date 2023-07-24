package org.tnsif.decisionmaking;

import java.util.Scanner;

//program to demonstrate on Cascaded IfElse Executer
public class CascadedIfElseExecuter {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int age1=sc.nextInt();
		int age2=sc.nextInt();
		int age3=sc.nextInt();
		if(age1>age2 && age1>age3) {
			System.out.println("age1 is greather:"+age1);
			
		}
		else if(age2>age1 && age2>age3) {
			System.out.println("age2 is greather:"+age2);
			
		}
		else {
			System.out.println("age3 is greather:"+age3);
		}

	}

}
