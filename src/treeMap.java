//// Java Program to create a TreeMap
//import java.util.Map;
//import java.util.TreeMap;
//
//public class treeMap {
//    public static void main(String args[])
//    {
//        // Create a TreeMap of Strings
//        // (keys) and Integers (values)
//        TreeMap<String, Integer> tm = new TreeMap<>();
//
//        System.out.println("TreeMap elements: " + tm);
//    }
//}


// Performing basic operations on TreeMap
import java.util.Map;
import java.util.TreeMap;
public class treeMap {
    public static void main(String[] args)
    {
        Map<String, Integer> tm = new TreeMap<>();
        // Adding elements to the tree map
        tm.put("A", 1);
        tm.put("C", 3);
        tm.put("B", 2);
        // Getting values from the tree map
        int ans = tm.get("A");
        System.out.println(STR."Value of A: \{ans}");
        // Removing elements from the tree map
        tm.remove("B");
        // Iterating over the elements of the tree map
        for (String key : tm.keySet()) {
            // keySet(): returns the keys in sorted order
            System.out.println(STR."Key: \{key}, Value: \{tm.get(key)}");
        }
    }
}
