package CapgeminiTraining.Java.Assignment3;


import java.util.Hashtable;

/**
 * Write a user defined class say Employee that overrides equals() & hashCode() methods.
 * Equals() always returns true & hashCode() always returns a fixed number. Make
 * such a class as key of you Hashtable. Observe the behavior while calling put & get methods.
 */
class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int hashCode() {
        return 10;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

public class Assignment3Q5 {
    public static void main(String[] args) {
        Employee e1 = new Employee("neeraj",1);
        Employee e2 = new Employee("test",2);
        Employee e3 = new Employee("pankaj",4);

        Hashtable<Employee,String> hs = new Hashtable<>();
        hs.put(e1,"test");
        hs.put(e2,"test2");
        hs.put(e3,"test3");

        System.out.println(hs);
    }
}