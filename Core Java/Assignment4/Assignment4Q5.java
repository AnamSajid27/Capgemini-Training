package CapgeminiTraining.Java.Assignment4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * Create a string that consists of the first letter of each word in the list of Strings provided.
 * HINT: Use Consumer interface & a String Builder to construct the result.
 */

public class Assignment4Q5 {
    List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

    public static void main(String[] args) {
        Assignment4Q5 assignment4Q5 = new Assignment4Q5();
        processWords(assignment4Q5.list);
    }

    public static String processWords(List<String> list) {
        StringBuilder words = new StringBuilder();
        Consumer<String> consumer = p-> words.append(p.charAt(0));

         list.stream().forEach(consumer);
        System.out.println(words);
        return  words.toString();
    }
}