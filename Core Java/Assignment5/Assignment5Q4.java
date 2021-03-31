package CapgeminiTraining.Java.Assignment5;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 1. Find all transactions in the year 2011 and sort them by value (small to high).
 *
 * 2. Print all transactions’ values from the traders living in Delhi.
 *
 * 3. What’s the highest value of all the transactions?
 *
 * 4. Find the transaction with the smallest value.
 */
/*
class Trader {
    private String name;
    private String city;
}
*/
class Transaction {
    private Trader trader;
    private int year;
    private int value;

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getYear() {
        return year;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", year=" + year +
                ", value=" + value +
                '}';
    }
}
public class Assignment5Q4 {
    public static List<Transaction> sortTransactions(List <Transaction> transactions) {
        List<Transaction> sortedTrans= new ArrayList<>();
        sortedTrans=transactions.stream()
                .filter(p->p.getYear()==2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toCollection(ArrayList::new));
        return  sortedTrans;
    }

    public static List<Integer> transaction3sValuesDelhi(List<Transaction> transactions) {
        List<Integer> transactioValueDelhi = new ArrayList<>();
        transactions.stream()
                .filter(p->p.getTrader().getCity().equals("Delhi"))
                .forEach(p->transactioValueDelhi.add(p.getValue()));
        System.out.println(transactioValueDelhi);
        return transactioValueDelhi;
    }
    public static int highestTransaction2(List<Transaction> transactions){
        int mx=Integer.MIN_VALUE;
        List<Integer>list = new ArrayList<>();
        transactions.stream()
                .forEach(p->list.add(p.getValue()));
        mx =Collections.max(list);
        return  mx;
    }

    public static int smallestTransaction1(List<Transaction> transactions){
        int mn=Integer.MAX_VALUE;
        List<Integer>list = new ArrayList<>();
        transactions.stream()
                .forEach(p->list.add(p.getValue()));
        mn =Collections.min(list);
        return  mn;

    }

    public static void main(String[] args) {
        Trader t1 = new Trader("name1", "Bangalore");
        Trader t2 = new Trader("name2", "Pune");
        Trader t3 = new Trader("name3", "Bangalore");
        Trader t4 = new Trader("name4", "Delhi");
        Trader t5= new Trader("name5", "Chennai");

        Trader t6 = new Trader("name6", "Pune");
        Trader t7 = new Trader("name7", "Delhi");
        Trader t8 = new Trader("name8", "Delhi");
        Trader t9 = new Trader("name9", "Pune");

        Transaction ts1 = new Transaction(t1,2011,300);
        Transaction ts2 = new Transaction(t2,2011,200);
        Transaction ts3 = new Transaction(t3,2012,100);
        Transaction ts4 = new Transaction(t4,2011,400);
        Transaction ts5 = new Transaction(t5,2011,400);
        Transaction ts6 = new Transaction(t6,2010,300);
        Transaction ts7 = new Transaction(t7,2013,200);
        Transaction ts8 = new Transaction(t8,2012,150);
        Transaction ts9 = new Transaction(t9,2009,400);

        ArrayList<Transaction> transactions = new ArrayList<>();
        transactions.add(ts1);
        transactions.add(ts2);
        transactions.add(ts3);
        transactions.add(ts4);
        transactions.add(ts5);
        transactions.add(ts6);
        transactions.add(ts7);
        transactions.add(ts8);
        transactions.add(ts9);
        sortTransactions(transactions);
        transaction3sValuesDelhi(transactions);
        System.out.println(highestTransaction2(transactions));


    }
}