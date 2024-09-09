package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {

    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

        Map<String, Integer> productMap = new HashMap<>();

        for (String[] arr : productArr) {
            productMap.put(arr[0], Integer.valueOf(arr[1]));
        }
/*
        for (int i = 0; i < productArr.length; i++) {
            map.put(productArr[i][0], Integer.valueOf(productArr[i][1]));
        }
*/

        for (String key : productMap.keySet()) {
            System.out.println("product name: " + key + ", price: " + productMap.get(key));
        }
/*
        productMap.entrySet().forEach(entry -> {
                    System.out.println(
                            "product name: " + entry.getKey() +
                            ", price: " + entry.getValue());
                });

        productMap.forEach((key, value) -> {
            System.out.println("product name: " + key + ", price: " + value);
        });
*/
    }
}
