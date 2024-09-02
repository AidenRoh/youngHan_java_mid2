package collection.link;

public class MyLinkedListV2Main {

    public static void main(String[] args) {
        MyLinkedListV2 list = new MyLinkedListV2();
        //마지막에 추가 // O(n)
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        //첫 번째 항목에 추가, 삭제
        System.out.println("add new node at first");
        list.add(0, "newNode1"); //O(1)
        System.out.println(list);

        System.out.println("remove element at first");
        list.remove(0); //O(1)
        System.out.println(list);

        //중간 항목에 추가, 삭제
        System.out.println("add new node in middle");
        list.add(1, "newNode2");//O(n) search element positioned in middle + O(1) add new node = O(n)
        System.out.println(list);

        System.out.println("remove element in middle");
        list.remove(1); //remove O(n) search element positioned in middle + O(1) remove node = O(n)
        System.out.println(list);



    }
}
