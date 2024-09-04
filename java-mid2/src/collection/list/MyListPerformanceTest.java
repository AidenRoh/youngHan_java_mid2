package collection.list;

public class MyListPerformanceTest {

    public static void main(String[] args) {
        int size = 50_000;
        System.out.println(" == add MyArrayList == ");
        addFirst(new MyArrayList<>(), size);
        addMid(new MyArrayList<>(), size); //search O(1), add element O(n)

        MyArrayList<Integer> arrayList = new MyArrayList<>(); //utilize for searching
        addLast(arrayList, size);//search O(1), add element O(1)

        int loop = 10000;

        System.out.println(" == get element in MyArrayList == ");
        getIndex(arrayList, loop, 0);
        getIndex(arrayList, loop, size / 2);
        getIndex(arrayList, loop, size - 1);

        System.out.println(" == search element in MyArrayList == ");
        search(arrayList, loop, 0);
        search(arrayList, loop, size / 2);
        search(arrayList, loop, size - 1);

        System.out.println(" -------------------------------- ");

        System.out.println(" == add MyLinkedList == ");
        addFirst(new MyLinkedList<>(), size);
        addMid(new MyLinkedList<>(), size);//search O(n), add element O(1)

        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        addLast(linkedList, size);//search O(n), add element O(1)

        System.out.println(" == get element in MyLinkedList == ");
        getIndex(linkedList, loop, 0);
        getIndex(linkedList, loop, size / 2);
        getIndex(linkedList, loop, size - 1);

        System.out.println(" == search element in MyLinkedList == ");
        search(linkedList, loop, 0);
        search(linkedList, loop, size / 2);
        search(linkedList, loop, size - 1);

    }

    private static void addFirst(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(
                "the amount of elements added in front: " + size
                + ", time taken: " + (endTime - startTime) + "ms");
    }

    private static void addMid(MyList<Integer> list, int size) {
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

    private static void addLast(MyList<Integer> list, int size) {
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

    private static void getIndex(MyList<Integer> list, int loop, int index) {
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

    private static void search(MyList<Integer> list, int loop, int findValue) {
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
