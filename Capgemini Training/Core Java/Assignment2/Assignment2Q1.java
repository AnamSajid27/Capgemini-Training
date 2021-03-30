package com.company.Assignments.Assignment2;

/**
 * Q1. Write a singleton class. Confirm that singleton class cannot be inherited.
 *
 * Singleton Class:-
 *
 * The singleton design pattern is used to restrict the instantiation of a class and ensures that only one instance of the class exists in the JVM. In other words, a singleton class is a class that can have only one object (an instance of the class) at a time per JVM instance.
 *
 * Specifications :
 *
 * class SingletonInheritanceCheck{ }
 * public class Assignment2Q1 {}
 */


class SingletonInheritanceCheck{
    private static  SingletonInheritanceCheck singletonInheritanceCheck = null;
    private SingletonInheritanceCheck(){}
    public static SingletonInheritanceCheck getSingleton(){
        if(singletonInheritanceCheck==null)
            singletonInheritanceCheck = new SingletonInheritanceCheck();
        return singletonInheritanceCheck;
    }
}
public class Assignment2Q1 {
    public static void main(String[] args) {
        SingletonInheritanceCheck singletonInheritanceCheck = SingletonInheritanceCheck.getSingleton();
        System.out.println(singletonInheritanceCheck);
        SingletonInheritanceCheck singletonInheritanceCheck1 = SingletonInheritanceCheck.getSingleton();
        System.out.println(singletonInheritanceCheck1);


    }
}

