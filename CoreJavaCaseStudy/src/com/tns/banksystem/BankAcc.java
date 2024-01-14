package com.tns.banksystem;

abstract class BankAcc {
	private int accNo;
	private String accNm;
	private float accBal;
	
	
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.deposite(accBal);
	}

	public BankAcc() {

	}

	public void withdraw(float amount) {
		 this.accBal -= amount;
		System.out.println("Withdrow Sucessfully ...");
	}
	public void deposite(float amount) {
		this.accBal += amount;
		System.out.println("Deposite Sucessfully ...");
		toString();
	}
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}

}
