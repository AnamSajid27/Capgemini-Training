package CapgeminiTraining.Java.Assignment4;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


/**
 *
 * Remove the words that have odd lengths from the list. H
 * INT: Use one of the new methods from JDK 8. Use removeIf() method from Collection interface.
 */
interface RemoveDup
{
    public int removeDup(String str);
}
public class Assignment4Q4 {
    public ArrayList<String> removeOddLength(ArrayList<String> employeeList){
        ArrayList<String> list = new ArrayList<>();

        Predicate<String> filterEmp = (p)-> {
            if(Math.floorMod(p.length(),2)==0)
                return  true;
            else
                return false;
        };

        employeeList.stream()
                .filter(filterEmp)
                .forEach(p->list.add(p));

        return  list;
    }
    public static void main(String[] args) {
        // TomJones, Harry, EthanHardy, NancySmith, Deborah
        ArrayList<String> employeeList = new ArrayList<>();
        employeeList.add("TomJones");
        employeeList.add("Harry");
        employeeList.add("EthanHardy");
        employeeList.add("NancySmith");
        employeeList.add("Deborah");

        Assignment4Q4 assignment4Q4 = new Assignment4Q4();
        System.out.println(assignment4Q4.removeOddLength(employeeList));

    }
}

