package com.tns.banksystem;

abstract class CurrentAcc extends BankAcc {

	private float creditLimit = 500;

	//they also suggested creditLimit as a parameter in constructor but as it is a final
	//variable we can't set its value.
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
		// TODO Auto-generated constructor stub
	}

	public CurrentAcc() {
		super();
	}

	@Override
	public void withdraw(float amount) {
		// TODO Auto-generated method stub
		System.out.println("CurrentAcc withdraw method");
		super.withdraw(amount);
	}

	@Override
	public String toString() {
		return "Credit Limit = " + creditLimit;
	}
}