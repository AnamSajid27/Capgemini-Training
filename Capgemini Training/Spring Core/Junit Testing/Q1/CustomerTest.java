package com.springAssignment.Q1;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void customerDetail() {

       Customer customer = new Customer();
        ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");
        Customer customer1 = (Customer)context.getBean("customer");
        assertEquals(new Customer(111,"neeraj","8755946301",new Address("Gic","Berinag","uttrakhand","India","262531")),customer1);
    }


}