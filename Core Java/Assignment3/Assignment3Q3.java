package CapgeminiTraining.Java.Assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Assignment3Q3 {
    public static List traverseReverse(ArrayList aList){
        ArrayList sortedList = new ArrayList();
        ListIterator Itr = aList.listIterator(aList.size());
        while(Itr.hasPrevious()){
            sortedList.add(Itr.previous());

        }

        return  sortedList;
    }
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(50);

        traverseReverse(arrayList);

    }
}