package collection.set;

public class MyHashSetV0Main {

    public static void main(String[] args) {
        MyHashSetV0 set = new MyHashSetV0();
        set.add(1); //O(1)
        set.add(2); //O(n)
        set.add(3); //O(n)
        set.add(4); //O(n)
        set.add(5); //O(n)
        System.out.println(set);

        boolean result = set.add(4); // attempt to save duplicated datum
        System.out.println("result of duplicated datum save: " + result);
        System.out.println(set);

        System.out.println("set.contains(3) = " + set.contains(3));
        System.out.println("set.contains(99) = " + set.contains(99));
    }
}
