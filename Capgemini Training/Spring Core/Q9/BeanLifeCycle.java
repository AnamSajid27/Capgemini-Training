package com.capgemini.springAssignment.Q9;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycle implements InitializingBean, DisposableBean {
    private  int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void display(){
        System.out.println("id: "+getId()+"\n"+"Name: "+getName());
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying the bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initization bean");
    }
}
