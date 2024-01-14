package com.tns.banksystem;

abstract class SavingAcc extends BankAcc {
	
	
	private boolean isSalaried;

	float bal;
	
	private static final float MINBAL = 100;
	public SavingAcc(int accNo, String accNm, float accBal,boolean isSalaried) {
		super(accNo, accNm, accBal);
		bal = accBal;
		this.isSalaried = isSalaried;
		// TODO Auto-generated constructor stub
		
	}

	public SavingAcc() {

	}

	@Override
	public void withdraw(float amount) {
		System.out.println("SavingAcc Withdraw method");
		if (bal > MINBAL) {
			super.withdraw(amount);
		} else{
			System.out.println("Oops! You don't have enough Balance... : "+bal);
		}
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried() + "]";
	}
	public boolean isSalaried() {
		return isSalaried;
	}

	public void setSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}
	
}
