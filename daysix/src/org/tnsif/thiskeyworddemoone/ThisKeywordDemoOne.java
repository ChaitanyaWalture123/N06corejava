package org.tnsif.thiskeyworddemoone;

class Account{
	long accountNo;
	
	void setData(long accountNo) {
		this.accountNo= accountNo;
		
		
		
	}
	void display() {
	
		System.out.println(accountNo);
	}
}

public class ThisKeywordDemoOne {
	
	

	public static void main(String[] args) {
		Account a = new Account();
		a.setData(675758768L);
		
		a.display();

	}

}
