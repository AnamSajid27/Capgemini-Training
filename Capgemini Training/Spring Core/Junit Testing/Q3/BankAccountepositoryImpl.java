package com.capgemini.springAssignment.Q3;

import java.util.ArrayList;
import java.util.List;

public class BankAccountepositoryImpl implements  BankAccountRepository {

    private BankAccount bankAccount1;
    private BankAccount bankAccount2;

    public  void  BankAccountepositoryImpl(){}

    public BankAccountepositoryImpl(BankAccount bankAccount1, BankAccount bankAccount2) {
        this.bankAccount1 = bankAccount1;
        this.bankAccount2 = bankAccount2;
    }

    /*
    public BankAccount getBankAccount1() {
        return bankAccount1;
    }

    public void setBankAccount1(BankAccount bankAccount1) {
        this.bankAccount1 = bankAccount1;
    }

    public BankAccount getBankAccount2() {
        return bankAccount2;
    }

    public void setBankAccount2(BankAccount bankAccount2) {
        this.bankAccount2 = bankAccount2;
    }

*/

/*
    public List<BankAccount> getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(List<BankAccount> bankAccount) {
        this.bankAccount = bankAccount;
    }
*/
    @Override
    public double getBalance(long accountId) {

        /*                               using a list
        for(BankAccount account:bankAccount){
            if(accountId==account.getAccountId()){
                return account.getAccountBalance();
            }
        }
        */

        if(this.bankAccount1.getAccountId()==accountId){
           return bankAccount1.getAccountBalance();
        }
        else{
           return  bankAccount2.getAccountBalance();
        }




    }

    @Override
    public double updateBalance(long accountId, double newBalance) {

        double updatedBal=0;
         if(this.bankAccount1.getAccountId()==accountId){
             updatedBal = newBalance;
             bankAccount1.setAccountBalance(updatedBal);
         }
         else{
             updatedBal = newBalance;
             bankAccount2.setAccountBalance(updatedBal);
         }

        /*
        for(BankAccount account:bankAccount){
            if(accountId==account.getAccountId()){
                updatedBal = newBalance;
                account.setAccountBalance(updatedBal);
            }
        }
        */
        return updatedBal;
    }
}
