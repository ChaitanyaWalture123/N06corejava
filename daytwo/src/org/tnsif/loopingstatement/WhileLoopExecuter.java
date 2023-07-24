package org.tnsif.loopingstatement;

import java.util.Scanner;

public class WhileLoopExecuter {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n = sc.nextInt();
	while(n>=1) {
		System.out.println(n+" ");
		n--;
	}

}
}
