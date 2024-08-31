package collection.array;

public class MyArrayListV2Main {

    public static void main(String[] args) {
        //범위 초과일 때, 새로운 배열 생성 후 복사 붙이기 하는 과정 추가
        MyArrayListV2 list = new MyArrayListV2(2 );
        System.out.println(" == data add ==");
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);
        list.add("c");
        System.out.println(list);
        list.add("d");
        System.out.println(list);
        list.add("f");
        System.out.println(list);
    }
}
