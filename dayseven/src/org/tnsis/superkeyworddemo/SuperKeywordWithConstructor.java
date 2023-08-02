package org.tnsis.superkeyworddemo;

class Google{
	String ceo;

	public Google(String ceo) {
		
		System.out.println("default constructor:"+ceo);
	}
	
}

class Gmail extends Google{

	String userid;
	
	

	public Gmail(String ceo, String userid) {
		super(ceo);
		this.userid = userid;
		
		System.out.println("email_id : "+userid);
	}
	
	
}

public class SuperKeywordWithConstructor {

	public static void main(String[] args) {
		
		Gmail g= new Gmail("Sundar pichai","abc@gmail.com");
		

	}

}
