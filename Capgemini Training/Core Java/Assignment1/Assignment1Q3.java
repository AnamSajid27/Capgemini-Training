package CapgeminiTraining.Java.Assignment1;

import java.util.Scanner;

class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
        double si=0;
        si = (principalAmount*time*interestRate)/100;
        return  si;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
        double ci=0;

        ci = (principalAmount * (Math.pow((1+interestRate),time)) ) - principalAmount;

        return ci;
    }
}
public class Assignment1Q3 {
    public static void main(String[] args) {
        SiCi siCi = new SiCi();
        double principalAmounnt,interestRate;
        int time;
        System.out.println("Enter the principal Amount: ");
        Scanner sc = new Scanner(System.in);
        principalAmounnt = sc.nextDouble();
        System.out.println("Enter the Annual interest rate: ");
        interestRate = sc.nextDouble();
        System.out.println("Enter the period of time: ");
        time = sc.nextInt();


        System.out.println("The simple interest for the principal Amount "+principalAmounnt+" for "+time+" years: "+siCi.simpleInterest(principalAmounnt,time,interestRate));

        System.out.println("The compound interest for the principal Amount "+principalAmounnt+" for "+time+" years: "+siCi.simpleInterest(principalAmounnt,time,interestRate));

    }
}
