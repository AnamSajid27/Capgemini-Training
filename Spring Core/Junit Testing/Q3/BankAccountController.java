package com.capgemini.springAssignment.Q3;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankAccountController implements ApplicationContextAware {
    private ApplicationContext context;
    public double withdraw(long accountId, double balanceToBeWithdraw){
        double newBalance=0;
        BankAccountepositoryImpl acc=(BankAccountepositoryImpl) context.getBean("BankRepo");
        if(acc.getBalance(accountId)>=balanceToBeWithdraw)
            newBalance = acc.getBalance(accountId)-balanceToBeWithdraw;
        acc.updateBalance(accountId,newBalance);
        return newBalance;
    }
    public double deposit(long accountId, double balance){
        BankAccountepositoryImpl acc=(BankAccountepositoryImpl) context.getBean("BankRepo");
        double Newbalance = acc.getBalance(accountId)+balance;
        return acc.updateBalance(accountId,Newbalance);

    }
    public double getBalance(long accountId){

        BankAccountepositoryImpl balance=(BankAccountepositoryImpl) context.getBean("BankRepo");
       return balance.getBalance(accountId);

    }
    public boolean fundTransfer(long fromAccount, long toAccount, double amont){
        BankAccountepositoryImpl accountepository=(BankAccountepositoryImpl) context.getBean("BankRepo");
        if(accountepository.getBalance(fromAccount)>=amont){
           double updatedAmt= amont+accountepository.getBalance(toAccount);

           // updating both the accounts
            accountepository.updateBalance(fromAccount,accountepository.getBalance(fromAccount)-amont);
            accountepository.updateBalance(toAccount,updatedAmt);
            return true;
        }
        return false;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context=applicationContext;
    }
}
