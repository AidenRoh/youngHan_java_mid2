package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        //add data of student score
        studentMap.put("John", 90);
        studentMap.put("Jane", 80);
        studentMap.put("Jack", 80);
        studentMap.put("Jill", 100);
        System.out.println(studentMap);

        //search student
        Integer result = studentMap.get("John");
        System.out.println("result = " + result);

        System.out.println("keySet");
        Set<String> students = studentMap.keySet();
        for (String student : students) {
            Integer value = studentMap.get(student);
            System.out.println("key = " + student + ", value = " + value);
        }

        System.out.println("entrySet");
        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key = " + key + ", value = " + value);
        }

        System.out.println("values");
        Collection<Integer> values = studentMap.values();
        for (Integer value : values) {
            System.out.println("value = " + value);
        }

    }
}
