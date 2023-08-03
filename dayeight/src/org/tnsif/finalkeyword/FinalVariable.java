package org.tnsif.finalkeyword;

public class FinalVariable {
	/* final int x;
	 * final variable must be initialize during declaration
	*/
	final float SALARY=67000.78f;
	
	void print()
	{
		/*we cannot change the value of variable*/
		
		//SALARY=10000.50f;
		
		System.out.println("salary is :"+SALARY);
	}
	

}
