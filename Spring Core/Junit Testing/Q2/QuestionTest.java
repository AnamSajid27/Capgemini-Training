package com.springAssignment.Q2;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {

    @Test
    void displayAnswerList() {
        Question questionExpacted = new Question();
        questionExpacted.setQuestionId(111);
        questionExpacted.setQuestion("what is Spring?");

        List<String> answers = Arrays.asList("Spring is a lightweight framework " ,"the Spring framework comprises several modules such as IOC, AOP, DAO, Context, ORM, WEB MVC etc.","It was developed by Rod Johnson in 2003.");
        questionExpacted.setAnswers(answers);



        ApplicationContext context = new ClassPathXmlApplicationContext("springQ2.xml");
        Question questionActual = (Question)context.getBean("Question") ;

        assertEquals(questionExpacted.toString(),questionActual.toString());


    }

    @Test
    void displayAnswerSet() {
    }

    @Test
    void displayAnswerMap() {
    }
}