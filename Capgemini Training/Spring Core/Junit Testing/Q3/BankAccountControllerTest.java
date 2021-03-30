package com.springAssignment.Q3;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountControllerTest {

    @Test
    void withdraw() {
        ApplicationContext context = new ClassPathXmlApplicationContext("springQ3.xml");
        BankAccountController controller = (BankAccountController)context.getBean("controller");

        double expacted=10000;
        double actual = controller.withdraw(1171,5000);
        assertEquals(expacted,actual);

    }

    @Test
    void deposit() {
        ApplicationContext context = new ClassPathXmlApplicationContext("springQ3.xml");
        BankAccountController controller = (BankAccountController)context.getBean("controller");

        double expacted=20000;
        double actual = controller.deposit(1171,5000);
        assertEquals(expacted,actual);
    }

    @Test
    void getBalance() {
        ApplicationContext context = new ClassPathXmlApplicationContext("springQ3.xml");
        BankAccountController controller = (BankAccountController)context.getBean("controller");

        double expacted=15000;
        double actual = controller.getBalance(1171);
        assertEquals(expacted,actual);
    }

    @Test
    void fundTransfer() {
        ApplicationContext context = new ClassPathXmlApplicationContext("springQ3.xml");
        BankAccountController controller = (BankAccountController)context.getBean("controller");

        boolean expacted=true;
        boolean actual = controller.fundTransfer(1171,1172,5000);
        assertEquals(expacted,actual);
    }
}