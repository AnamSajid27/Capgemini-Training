package com.capgemini.springAssignment.Q6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("dbConfig.properties")
public class DbConfiguration {
    private String dbClassName;
    private String dbUrl;
    private String user;
    private  String password;

    public String getDbClassName() {
        return dbClassName;
    }

    @Value("${driver}")
    public void setDbClassName(String dbClassName) {
        this.dbClassName = dbClassName;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    @Value("${url}")
    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public String getUser() {
        return user;
    }

    @Value("${user}")
    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    @Value("${password}")
    public void setPassword(String password) {
        this.password = password;
    }

    public void display(){
        System.out.println("Driver :"+getDbClassName());
        System.out.println("Url: "+getDbUrl());
        System.out.println("User: "+getUser());
        System.out.println("Password: "+getPassword());
    }
}
