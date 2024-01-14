package com.tns.banksystem;

import java.util.Scanner;

public class MMBankFactory extends BankFactory {
	@Override
	public MMSavingAcc getNewSavingAcc(int accNo, String accName, float accBal, boolean isSalaried) {
		return new MMSavingAcc(accNo, accName, accBal, isSalaried);
	}

	@Override
	public MMCurrentAcc getNewCurrentAcc(int AccNo, String accNm, float accBal, float creditLimit) {
		// TODO Auto-generated method stub
		return new MMCurrentAcc(AccNo, accNm, accBal, creditLimit);
	}
	
}
