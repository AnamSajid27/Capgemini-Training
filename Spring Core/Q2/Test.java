package com.capgemini.springAssignment.Q2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("springQ2.xml");

        // calling list of answer
       Question question =(Question)context.getBean("Question");
       question.displayAnswerList();


       // calling set of answer
        System.out.println("=====================================");
        Question question1 =(Question)context.getBean("Question1");
        question1.displayAnswerSet();

        // calling map of answer
        System.out.println("=====================================");
        Question question2 =(Question)context.getBean("Question2");
        question2.displayAnswerMap();

    }
}
