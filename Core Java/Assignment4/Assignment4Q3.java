package CapgeminiTraining.Java.Assignment4;

import javax.swing.plaf.FontUIResource;
import java.util.function.Function;


public class Assignment4Q3 {
    static int modifyValue(int n,Function fun) {

      return (int)fun.apply(n);



    }

    static class Product {
    }

    static void display(int r) {
        System.out.println(r);
    }

    public static void main(String[] args) {
        int r =modifyValue(5,val->(Integer)val+ 5);
        display(r);
    }
}
