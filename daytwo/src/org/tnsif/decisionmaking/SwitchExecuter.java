package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchExecuter {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the song no");
		int songno=s.nextInt();
		switch(songno) {
		case 1:
			System.out.println("Waka Waka");
			break;
		
		case 2:
			System.out.println("Taki Taki");
			break;
			
		case 3:
			System.out.println("jai shree ram");
			break;
			
		default :
			System.out.println("invalid input");
		}

	}

}
