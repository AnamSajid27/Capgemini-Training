package com.capgemini.springAssignment.Q10;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ContextAwareExample implements ApplicationContextAware, BeanNameAware {
    private String place;
    Demo demo;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Demo getDemo() {
        return demo;
    }

    public void setDemo(Demo demo) {
        this.demo = demo;
    }

    public void display(){
        System.out.println("Coordinate of "+getPlace()+" ("+getDemo().getX()+","+getDemo().getY()+")");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("application name "+applicationContext);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name is:"+s);
    }
}
