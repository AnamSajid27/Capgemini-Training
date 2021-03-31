package CapgeminiTraining.Java.Assignment3;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

/**
 * Write a class Person having weight, height & name. Create multiple person objects &
 * print them in the sorted order. In the sorting order first sort based upon
 * their weight & it two persons have same weight them sort them based upon their height. Use TreeSet.
 */


class Person{
    private String name;
    private int height;
    private double weight;

    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}

class PersonListForSorting implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Person p1 = (Person)o1;
        Person p2 = (Person)o2;

            if(p1.getWeight()<p2.getWeight())
                return -1;
            else if(p1.getWeight()>p2.getWeight())
                return 1;
            else {
                if(p1.getHeight()<p2.getHeight())
                    return -1;
                else
                    return 1;
            }

        }

    }

public class Assignment3Q1 {
    public static void main(String[] args) {
        Person p1 = new Person("Alice",5,60);
        Person p2 = new Person("Charles",6,65);
        Person p3 = new Person("Lewis",4,55.3);
        Person p4 = new Person("Matthew",7,85);
        Person p5 = new Person("Thomas",6,63);


        TreeSet<Person> personTreeSet = new TreeSet<>(new PersonListForSorting());
        personTreeSet.add(p1);
        personTreeSet.add(p2);
        personTreeSet.add(p3);
        personTreeSet.add(p4);
        personTreeSet.add(p5);

        System.out.println(personTreeSet);



    }
}