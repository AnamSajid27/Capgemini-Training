package CapgeminiTraining.Java.Assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * Create a Class SavingAccount with field’s acc_balance, acc_ID, accountHoldername, isSalaryAccount.
 * Also add setter and getter methods with business method like withdraw and deposit.
 *
 * a. Create class BankAccountList which will maintain SavingAccount objects. Ensure that this class
 * should not allow duplicates as well as data should be displayed in sorted order. (as per acc_ID)
 */

class SavingAccount implements  Comparable {

    private double acc_balance;
    private int acc_ID;
    private String accountHolderName;
    private boolean isSalaryAccount;

    public SavingAccount(double acc_balance, int acc_ID, String accountHolderName, boolean isSalaryAccount) {
        this.acc_balance = acc_balance;
        this.acc_ID = acc_ID;
        this.accountHolderName = accountHolderName;
        this.isSalaryAccount = isSalaryAccount;
    }

    public double getAcc_balance() {
        return acc_balance;
    }

    public void setAcc_balance(double acc_balance) {
        this.acc_balance = acc_balance;
    }

    public int getAcc_ID() {
        return acc_ID;
    }

    public void setAcc_ID(int acc_ID) {
        this.acc_ID = acc_ID;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public boolean isSalaryAccount() {
        return isSalaryAccount;
    }

    public void setSalaryAccount(boolean salaryAccount) {
        isSalaryAccount = salaryAccount;
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "acc_balance=" + acc_balance +
                ", acc_ID=" + acc_ID +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", isSalaryAccount=" + isSalaryAccount +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        int acId = this.acc_ID;
        SavingAccount s = (SavingAccount)o;
        int acId2 = s.acc_ID;
        if(acId<acId2)
            return -1;
        else if(acId>acId2)
            return 1;
        else
            return 0;
    }
}

class BankAccountList{
    public BankAccountList(){}

    private TreeSet<SavingAccount> savingAccounts = new TreeSet<>();

    public boolean addSavingAccount(SavingAccount savingAccount) {
         boolean ans=savingAccounts.add(savingAccount);

        return ans;
    }

    public List<Integer> displaySavingAccountIds() {
        List<Integer> savingAccountID = new ArrayList<>();
        for(SavingAccount s:savingAccounts){
            savingAccountID.add(s.getAcc_ID());
        }

        return savingAccountID;
    }
}

public class Assignment3Q9 {
    public static void main(String[] args) {
        SavingAccount s1 = new SavingAccount(20000.0, 1234,"Sanjar Sharma",true);
        SavingAccount s2 = new SavingAccount(15000.0, 3445, "Ayub Khan",false);
        SavingAccount s3 = new SavingAccount(34000.0, 8354,"Nitin Giri", false);
        SavingAccount s4 = new SavingAccount(2000.0, 1234, "Sanjar Sharma", true);

        BankAccountList bankAccountList  = new BankAccountList();
        bankAccountList.addSavingAccount(s1);
        bankAccountList.addSavingAccount(s2);
        bankAccountList.addSavingAccount(s3);
        bankAccountList.addSavingAccount(s4);

        System.out.println(bankAccountList.displaySavingAccountIds());
    }
    /*SavingAccount{acc_balance=20000.0, acc_ID=1234, accountHolderName='Sanjar Sharma
        ', isSalaryAccount=true}
        SavingAccount{acc_balance=15000.0, acc_ID=3445, accountHolderName='Ayub Khan', i
            sSalaryAccount=false}
        SavingAccount{acc_balance=34000.0, acc_ID=8354, accountHolderName='Nitin Giri',
                isSalaryAccount=false}
        SavingAccount{acc_balance=12000.0, acc_ID=1234, accountHolderName='Sanjar Sharma
            ', isSalaryAccount=true}

                    */






}