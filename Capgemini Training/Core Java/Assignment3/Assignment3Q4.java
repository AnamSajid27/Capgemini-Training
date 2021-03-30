package CapgeminiTraining.Java.Assignment3;

import com.sun.org.apache.regexp.internal.RE;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Write a program using Hashtable or HashMap where Date of birth is a key & Employee name as value.
 * Design the class Date is such a way where the get method fails if two employees have same
 * day & month of birth but birth year is different.
 */


class DateClass {
    private int date;
    private int month;
    private int year;

    public DateClass(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "DateClass{" +
                "date=" + date +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}

public class Assignment3Q4 {

    public String getEmployee(HashMap<DateClass, String> dob, String employeeName){
        Set set = dob.entrySet();
        Iterator itr = set.iterator();
        Iterator itr2 = set.iterator();
        int day=0;
        int month=0;
        int year=0;
        while (itr.hasNext()){
            Map.Entry m1 = (Map.Entry)itr.next();
            DateClass dateClass = (DateClass)m1.getKey();
            if(m1.getValue().equals(employeeName)){

                day= dateClass.getDate();
                month=dateClass.getMonth();
                year = dateClass.getYear();
            }

        }

        while (itr2.hasNext()){
            Map.Entry m1 = (Map.Entry)itr2.next();
            DateClass dateClass = (DateClass)m1.getKey();
            if( (day==dateClass.getDate() && month==dateClass.getMonth() && year!=dateClass.getYear()) && (!m1.getValue().equals(employeeName)) ){
                return "get method fails";
            }

        }
        return employeeName;
    }

    public static void main(String[] args) {
        HashMap<DateClass,String> employee = new HashMap<>();

        DateClass dateClass1 = new DateClass(04,07,1995);
        DateClass dateClass2 = new DateClass(04,03,1997);
        DateClass dateClass3 = new DateClass(04,07,1995);

        DateClass dateClass4 = new DateClass(04,03,1995);

        employee.put(dateClass1,"Ajay1");
        employee.put(dateClass2,"Ajay2");
        employee.put(dateClass3,"Ajay");
        employee.put(dateClass4,"Ajay3");

        Assignment3Q4 assignment3Q4 = new Assignment3Q4();
        assignment3Q4.getEmployee(employee,"Ajay2");



    }
}

