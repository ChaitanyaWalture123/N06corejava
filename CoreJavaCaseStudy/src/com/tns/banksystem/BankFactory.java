package com.tns.banksystem;

abstract class BankFactory {

	public SavingAcc getNewSavingAcc(int accNo, String accName, float accBal, boolean isSalaried)
	{
		System.out.println("BankFactory Saving acc");
		return new MMSavingAcc(accNo, accName, accBal, isSalaried);
	}
	
	public CurrentAcc getNewCurrentAcc(int AccNo,String accNm,float accBal,float creditLimit)
	{
		System.out.println("BankFactory current acc");
		return new MMCurrentAcc(AccNo, accNm, accBal, creditLimit);
	}
}
