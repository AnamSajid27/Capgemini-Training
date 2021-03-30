package CapgeminiTraining.Java.Assignment3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *  Test fail-fast iterators within multithreaded environment. Note example of fail fast iterator is
 *  Vector, ArrayList, HashSet etc. And fail-safe is ConcurrentHashMap, CopyOnWriteArrayList etc.
 */

public class Assignment3Q8a {
    public static void failFast(Map<String, String> cityCode){

        Iterator itr = cityCode.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry m1 = (Map.Entry)itr.next();
            System.out.println(m1.getKey()+" "+m1.getValue());

            cityCode.put("Uttrakhand","India");
        }
    }
    public static void main(String[] args) {
        Map<String, String> cityCode = new HashMap<String, String>();
        cityCode.put("Delhi", "India");
        cityCode.put("Moscow", "Russia");
        cityCode.put("New York", "USA");
        failFast(cityCode);
    }
}