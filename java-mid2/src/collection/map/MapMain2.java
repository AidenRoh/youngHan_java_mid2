package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        // add student data
        studentMap.put("John", 90);
        System.out.println(studentMap);

        //saving at same key, value will be replaced into new value
        studentMap.put("John", 100);
        System.out.println(studentMap);

        boolean containsKey = studentMap.containsKey("John");
        System.out.println("containsKey = " + containsKey);

        // delete data
        studentMap.remove("John");
        System.out.println(studentMap);
    }
}
