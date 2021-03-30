package CapgeminiTraining.Java.Assignment1;

import java.util.Scanner;

/**
 * Q5. Calculate the income tax on the basis of following table.
 *
 *               Note:-Assume slab is consider for Male, Female as well as Senior citizen
 *
 *                              Slab                                   Income Range                             Tax payable in Percentage
 *
 *                              Slab A                               0-1,80,000                                                                  Nil
 *
 *                              Slab B                               1,81,001-3,00,000                                                    10%
 *
 *                              Slab C                               3,00,001-5,00,000                                                    20%
 *
 *                              Slab D                               5,00,001-10,00,000                                                 30%
 *
 *               Accept CTC from user and display tax amount
 */

class TaxAmount{
    double tax=0;
    public double calculateTaxAmount(int ctc){
        if(ctc>0 && ctc<=180000){
            tax= 0;
        }
        else if(ctc >= 180001 && ctc <=300000){
            tax = (ctc*10)/100;
        }
        else if(ctc>=300001 && ctc<=500000){
            tax = (ctc*20)/100;
        }
        else if(ctc>=500001 && ctc <=1000000)
            tax = (ctc*30)/100;

     return tax;
    }
}
public class Assignment1Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ctc;
        System.out.println("Enter your CTC: ");
        ctc = sc.nextInt();

        // Creating the reference variable for TaxAmount class to envoke the calculateTaxAmount method

        TaxAmount taxAmount = new TaxAmount();
        double tax;
        tax = taxAmount.calculateTaxAmount(ctc);
        System.out.println("Tax payable : "+tax);
    }
}
