package com.tns.banksystem;

public class MMSavingAcc extends SavingAcc{

	static final private float MINBAL=100;

	public MMSavingAcc() {
		super();
	}

	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
	}
	
	
	@Override
	public void withdraw(float amount) {
	
		if(isSalaried()){
            super.withdraw(amount);
        }else{
            System.out.println("Not Active");
        }
    }
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
