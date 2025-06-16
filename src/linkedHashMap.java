//import java.util.LinkedHashMap;
//
//public class linkedHashMap {
//    public static void main(String[] args) {
//
//        // Create a LinkedHashMap of
//        // Strings (keys) and Integers (values)
//        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
//
//        // Displaying the LinkedHashMap
//        System.out.println("" + lhm);
//    }
//}


// Adding Elements to a LinkedHashMap
import java.util.*;
class Geeks {
    public static void linkedHashMap(String args[]) {
        // Initialization of a LinkedHashMap
        // using Generics
        LinkedHashMap<Integer, String> lhm
                = new LinkedHashMap<Integer, String>();
        // Add mappings to Map
        // using put() method
        lhm.put(3, "Geeks");
        lhm.put(2, "For");
        lhm.put(1, "Geeks");
        // Printing mappings to the console
        System.out.println("" + lhm);
    }
}