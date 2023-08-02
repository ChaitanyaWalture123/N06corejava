package org.tnsif.statickeyword;

public class StaticMethodExecutor {
	static void displayscore(int score) {
		
		/*we cant use no  static variable inside sTATIC method*/
		//sysout(str);
		System.out.println("score is :"+score);
	}

	public static void main(String[] args) {

		/*if any method outside main futn and if you want to access
		 * that method inside the main futhn then make it static
		 */
		displayscore(56);
	}

}
