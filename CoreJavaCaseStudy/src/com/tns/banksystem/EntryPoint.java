package com.tns.banksystem;

import java.util.Scanner;
import java.util.stream.Stream;

public class EntryPoint {
    static int accountNo = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Account Type : Saving/Current ");
        String accType = sc.next();

        System.out.println("Enter Account Balance You want to Put (Minimum amt. = 500rs) : ");
        float balance = sc.nextFloat();
        boolean salary = false;
        if (accType.equalsIgnoreCase("saving")){
            System.out.println("is Salaried? (true/false) : ");
            salary = sc.nextBoolean();
        }
        
        BankFactory bankFactory = new MMBankFactory();
        bankFactory.getNewCurrentAcc(accountNo += 1,accType,balance,500);
         
        bankFactory.getNewSavingAcc(accountNo += 1,accType,balance,salary);

        System.out.println("Want to Withdraw?(y/n)");
        String ans = sc.next();
        if (ans.equalsIgnoreCase("y")){
            System.out.println("Enter Amount");
            float amount = sc.nextFloat();
            new MMSavingAcc().withdraw(amount);
        }else {
            System.out.println("Want to Deposit?(y/n)");
            String res = sc.next();
            if (res.equalsIgnoreCase("y")) {
                System.out.println("Enter Amount");
                float amount = sc.nextFloat();
                new MMSavingAcc().deposite(amount);
            }
        }

    }
}
