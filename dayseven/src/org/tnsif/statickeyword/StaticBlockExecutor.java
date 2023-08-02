package org.tnsif.statickeyword;

public class StaticBlockExecutor {
int roll;
static String name;

static {
	//roll=2; we can not intialize the non static variable inside static block
	name="chaitanya";
	System.out.println(name);
}
	public static void main(String[] args) {
		
/*main futhn is static thence it calls static block ,method and variable by default
	}*/

}
} 
