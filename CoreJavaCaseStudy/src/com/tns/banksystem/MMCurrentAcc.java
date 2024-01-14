package com.tns.banksystem;

public class MMCurrentAcc extends CurrentAcc{
	public MMCurrentAcc() {
		super();
	}

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(float amount) {
		// TODO Auto-generated method stub
		super.withdraw(amount);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
