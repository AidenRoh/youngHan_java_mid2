package collection.array;

public class MyArrayListV3Main {

    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        //마지막에 추가
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        //원하는 위치에 추가
        System.out.println("addLast");
        list.add(3, "addLast"); //O(1)
        System.out.println(list);

        System.out.println("addFirst");
        list.add(0, "addFirst"); // O(n)
        System.out.println(list);

        //삭제
        System.out.println();

        Object removeLast = list.remove(4); // Last O(1)
        System.out.println("removeLast = " + removeLast);
        System.out.println(list);

        System.out.println();

        Object removeFirst = list.remove(0);// First O(n)
        System.out.println("removeFirst = " + removeFirst);
        System.out.println(list);
    }
}
