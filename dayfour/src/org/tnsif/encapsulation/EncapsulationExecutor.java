package org.tnsif.encapsulation;

public class EncapsulationExecutor {

	public static void main(String[] args) {
		Hdfc h=new Hdfc();
		h.setAccType("saving account");
		h.setAccountNo(12345678900321L);
		h.setAtmCardNo(123456543213L);
		h.setPinNo(1221);
		//System.out.println("Acount no.is: "+h.getAccountNo());
		
		//below line will call tostring() method;
		
		System.out.println(h);
		

	}

}
