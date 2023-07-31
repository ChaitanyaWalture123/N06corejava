package org.tnsif.instanceofdemo;

class RBI
{
	protected String ifsccode="RBISONGPA01";
	
	
	
}
class SBI extends RBI{
	SBI(){
	super.ifsccode="RBISONGPA01";
	String ifsccode="SBIN0002161";
	System.out.println(ifsccode);
	System.out.println(super.ifsccode);
	}
	
}
public class InstanceOfDemo {

	public static void main(String[] args) {
		SBI s =new SBI();
		System.out.println(s instanceof SBI);
		System.out.println(s instanceof RBI);
	}

}
