package com.company.Assignments.Assignment2;

import java.util.ArrayList;

/**
 * Q3. Write a program to consider saving & current account in the bank. Saving account holder has ‘Fixed Deposits’ whereas Current account holder has cash credit. Apply polymorphism to find out total cash in the bank.
 *
 * Description:-
 *
 * Write a program to claculate the total cash available in the bank. In this bank,bank will provide two types of accounts one is savings accounts and another is current account where current account has cash credits and savings account has fixed deposit options.
 *
 * Specifications:
 *
 * class CurrentAccount extends Assignment2Q3 {
 *     int totalDeposits = 10000;
 *     int creditLimit = 2000;
 *     @Override
 *     public int getCash() {}
 * }
 * class SavingsAccount extends Assignment2Q3 {
 *     int totalDeposits = 10000;
 *     int fixedDepositAmount = 5000;
 *     @Override
 *     public int getCash() {}
 * }
 * public class Assignment2Q3 {
 *     public int totalCashInBank(ArrayList<Integer> cash){}
 *     public int getCash(){}
 *     public static void main(String[] args) {}
 * }
 */

public class Assignment2Q3 {
    public int totalCashInBank(ArrayList<Integer> cash){
        int availBal=0;
        for(Integer i:cash){
            availBal+=i;
        }
        return availBal;
    }
    public int getCash(){
        return 0;
    }
    public static void main(String[] args) {
        Assignment2Q3 assignment2Q3 = new Assignment2Q3();

        CurrentAccount currentAccount = new CurrentAccount();
        int currentBal = currentAccount.getCash();

        SavingsAccount savingsAccount =new SavingsAccount();
        int savingBal = savingsAccount.getCash();

        ArrayList<Integer> cash = new ArrayList<>();
        cash.add(currentBal);
        cash.add(savingBal);

        assignment2Q3.totalCashInBank(cash);

    }
}
class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() {
        return totalDeposits-creditLimit;
    }
}
class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash() {
        return  totalDeposits+fixedDepositAmount;
    }
}
