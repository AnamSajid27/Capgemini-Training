package CapgeminiTraining.Java.Assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Test fail-safe iterators within multithreaded environment. Note example of fail fast iterator is
 * Vector, ArrayList, HashSet etc. And fail-safe is ConcurrentHashMap, CopyOnWriteArrayList etc.
 */


public class Assignment3Q8b {
    public static CopyOnWriteArrayList<Integer> failFast(CopyOnWriteArrayList<Integer> list){
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            Integer num = (Integer)itr.next();
            System.out.println(num);

            list.add(78);
        }
   return  list;
    }
    public static void main(String args[]) {
        CopyOnWriteArrayList<Integer> list
                = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 3, 5, 8 });

        failFast(list);
    }
}
