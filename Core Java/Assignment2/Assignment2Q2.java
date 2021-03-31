package com.company.Assignments.Assignment2;


import java.util.ArrayList;

/**
 * Q2. Write a program that describes the hierarchy of an organization. Here we need to write 3 classes Employee, Manager & Labour where Manager & Labour are the sub classes of the Employee. Manager has incentive & Labour has over time. Add the functionality to calculate total salary of all the employees. Use polymorphism i.e. method overriding.
 *
 * Description:-
 *
 * Write a program to claculate the total salaries given to all the employees by an organization. In this organization there are employees category under which Manager and Labour are working where manager will recieve incentive and labourer will receive overtime benifits.
 *
 * Specifications:
 *
 * class Manager extends Assignment2Q2 {
 *     @Override
 *     public int getSalary(int salary) {
 *         int incentive = 5000;
 *     }
 * }
 *
 * class Labour extends Assignment2Q2 {
 *     @Override
 *     public int getSalary(int salary) {
 *         int overtime = 500;
 *     }
 * }
 *
 * public class Assignment2Q2 {
 *     int salary = 10000;
 *     public int getSalary(int salary){}
 *     public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){}
 *     public static void main(String[] args) {}
 * }
 */

public class Assignment2Q2 {
    int salary = 10000;
    public int getSalary(int salary){
        this.salary= salary;
        return salary;

    }    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
        int totalSal=0;
        for(Integer sal:employeeSalaries){
            totalSal+=sal;
        }
        return totalSal;
    }
    public static void main(String[] args) {
        Assignment2Q2 assignment2Q2 = new Assignment2Q2();

        Manager manager = new Manager();

        int managerSalary =manager.getSalary(assignment2Q2.salary);

        Labour labour = new Labour();
        int labourSalary = labour.getSalary(assignment2Q2.salary);

        ArrayList<Integer> employeeSalaryList = new ArrayList<>();
        employeeSalaryList.add(managerSalary);
        employeeSalaryList.add(labourSalary);
    }
}
class Manager extends Assignment2Q2 {
     @Override
     public int getSalary(int salary) {
          int incentive = 5000;
          return salary+incentive;
      }
  }

          class Labour extends Assignment2Q2 {
     @Override
     public int getSalary(int salary) {
          int overtime = 500;
          return salary+overtime;
      }
  }

