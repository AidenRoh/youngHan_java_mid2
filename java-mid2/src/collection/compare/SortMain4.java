package collection.compare;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortMain4 {

    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        List<MyUser> list = Arrays.asList(myUser1, myUser2, myUser3);
        System.out.println("기본 데이터");
        System.out.println(list);

        System.out.println("Comparable");
        list.sort(null);
//        Collections.sort(list);
        System.out.println(list);

        System.out.println("IdComparator");
        list.sort(new IdComparator());
//        Collections.sort(list, new IdComparator());
        System.out.println(list);
    }
}
