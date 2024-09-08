package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        // add student data
        studentMap.put("John", 50);
        System.out.println(studentMap);

        // add new data if there is no save key
        if (!studentMap.containsKey("John")) {
            studentMap.put("John", 50);
        }
        System.out.println(studentMap);

        //better way
        studentMap.putIfAbsent("John", 50);
        studentMap.putIfAbsent("Jane", 60);
        System.out.println(studentMap);
    }
}
