package CapgeminiTraining.Java.Assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Create a new thread that prints the numbers from the list. Use class Thread & interface Consumer.
 */

public class Assignment4Q8 {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8);

        Consumer<List<Integer> > dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));

        Thread t = new Thread(()->dispList.accept(list1));
        t.start();


    }
}
