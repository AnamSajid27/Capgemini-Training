package com.capgemini.springAssignment.Q5;

import org.springframework.beans.factory.annotation.Required;

import javax.annotation.Resource;
import javax.inject.Inject;

public class Student {
    private  int age;
    private String name;

    private School school;

    public int getAge() {
        return age;
    }

    // thorw BeanInitializationException: Property 'age' is required for bean 'student'
    // if we will not set the propert of age field in xml file.

    @Required
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public School getSchool() {
        return school;
    }

   @Resource(name="school1")
    public void setSchool(School school) {
        this.school = school;
    }

    public void getStudentDetails(){
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
    }

    public void getStudentDetailsUsingResource(){
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("School: "+school.getName());
        System.out.println("Total Students: "+school.getTotalStudent());
    }
}
