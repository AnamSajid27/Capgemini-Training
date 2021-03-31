package CapgeminiTraining.Java.Assignment4;

/**
 * Write an application to perform basic arithmetic operations like add, subtract, multiply & divide.
 * You need to define a functional interface first.
 */
interface  Arithmetic{
    public  double ArithmeticOperation (int num1,int num2);

}


public class Assignment4Q1 {
    public double addition(int num1,int num2){
        Arithmetic add = (int n1,int n2)->  n1+n2;
        return add.ArithmeticOperation(num1,num2);
    }
    public double subtraction(int num1,int num2){
        Arithmetic sub = (int n1,int n2)->  n1-n2;
        return sub.ArithmeticOperation(num1,num2);
    }
    public double multiplication(int num1,int num2){
        Arithmetic mul = (int n1,int n2)->  n1*n2;
        return mul.ArithmeticOperation(num1,num2);
    }
    public double division(int num1,int num2){
        Arithmetic div= (int n1,int n2)->  (double) n1/n2;
        return div.ArithmeticOperation(num1,num2);
    }
    public static void main(String[] args) {
        Assignment4Q1 assignment4Q1 = new Assignment4Q1();
        System.out.println(assignment4Q1.addition(10,20));
        System.out.println(assignment4Q1.subtraction(20,10));
        System.out.println(assignment4Q1.multiplication(10,20));
        System.out.println(assignment4Q1.division(20,4));
    }
}
