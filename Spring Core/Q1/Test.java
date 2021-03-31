package com.capgemini.springAssignment.Q1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");

        // using the setter injection
        Customer customer=(Customer) context.getBean("customer");
        customer.customerDetail();

        // using constructor injection
        Customer customerCon=(Customer) context.getBean("customerCon");
        customerCon.customerDetail();

    }
}
