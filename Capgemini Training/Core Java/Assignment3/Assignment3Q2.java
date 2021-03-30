package CapgeminiTraining.Java.Assignment3;

import com.demo.LinkedList.LinkedListDemo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Prove that Hash Set is unordered & Linked Hash Set is ordered.
 */

public class Assignment3Q2 {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(10);
        linkedHashSet.add(30);
        linkedHashSet.add(5);
        linkedHashSet.add(89);
        linkedHashSet.add(1);


        HashSet hashSet = new HashSet();
        hashSet.add(10);
        hashSet.add(30);
        hashSet.add(5);
        hashSet.add(89);
        hashSet.add(1);

        ordered(linkedHashSet);
        unordered(hashSet);
    }
    public static LinkedHashSet ordered(LinkedHashSet linkedHashSet){
        System.out.println("printing linkedHashSet");
        for(Object i:linkedHashSet){
            System.out.println(i);
        }
        return linkedHashSet;
    }
    public static HashSet unordered(HashSet hashSet){
        System.out.println("printing HashSet");
        for(Object i:hashSet){
            System.out.println(i);
        }
        return  hashSet;
    }

}