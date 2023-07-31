package org.tnsif.thiskeyworddemoone;


class Bank{
	long accountNo;
	
	Bank(long accountNo){
		this.accountNo=accountNo;
		
	}
	void display() {
		System.out.println(accountNo);
	}
}
public class ThisKeywordDemo2 {

	public static void main(String[] args) {
		Bank b =new Bank(1234567899876L);
		b.display();
	}

}
