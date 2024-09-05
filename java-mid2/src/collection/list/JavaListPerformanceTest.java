package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaListPerformanceTest {

    public static void main(String[] args) {
        int size = 50_000;
        System.out.println(" == add ArrayList == ");
        addFirst(new ArrayList<>(), size);
        addMid(new ArrayList<>(), size); //search O(1), add element O(n)

        ArrayList<Integer> arrayList = new ArrayList<>(); //utilize for searching
        addLast(arrayList, size);//search O(1), add element O(1)

        int loop = 10000;

        System.out.println(" == get element in ArrayList == ");
        getIndex(arrayList, loop, 0);
        getIndex(arrayList, loop, size / 2);
        getIndex(arrayList, loop, size - 1);

        System.out.println(" == search element in ArrayList == ");
        search(arrayList, loop, 0);
        search(arrayList, loop, size / 2);
        search(arrayList, loop, size - 1);

        System.out.println(" -------------------------------- ");

        System.out.println(" == add LinkedList == ");
        addFirst(new LinkedList<>(), size);
        addMid(new LinkedList<>(), size);//search O(n), add element O(1)

        LinkedList<Integer> linkedList = new LinkedList<>();
        addLast(linkedList, size);//search O(n), add element O(1)

        System.out.println(" == get element in LinkedList == ");
        getIndex(linkedList, loop, 0);
        getIndex(linkedList, loop, size / 2);
        getIndex(linkedList, loop, size - 1);

        System.out.println(" == search element in LinkedList == ");
        search(linkedList, loop, 0);
        search(linkedList, loop, size / 2);
        search(linkedList, loop, size - 1);

    }

    private static void addFirst(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(
                "the amount of elements added in front: " + size
                + ", time taken: " + (endTime - startTime) + "ms");
    }

    private static void addMid(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i / 2, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(
                "the amount of elements added in middle(average): " + size
                        + ", time taken: " + (endTime - startTime) + "ms"
        );
    }

    private static void addLast(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(
                "the amount of elements added in front: " + size
                        + ", time taken: " + (endTime - startTime) + "ms"
        );
    }

    private static void getIndex(List<Integer> list, int loop, int index) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(
                "index: " + index +
                ", loop times: " + loop +
                ", time taken: " + (endTime - startTime) + "ms"
        );
    }

    private static void search(List<Integer> list, int loop, int findValue) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(
                "index: " + findValue +
                ", loop times: " + loop +
                ", time taken: " + (endTime - startTime) + "ms"
        );
    }
}
