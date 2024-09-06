package collection.set;

import collection.set.member.Member;

public class JavaHashCodeMain {

    public static void main(String[] args) {
        //basic hashCode of Object is constructed by reference data(address)
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1.hashCode() = " + obj1.hashCode());
        System.out.println("obj2.hashCode() = " + obj2.hashCode());

        //각 클래스마다 hashCode를 이미 오버라이딩 해두었음
        Integer i = 10;
        String strA = "A";
        String strAB = "AB";

        System.out.println("i.hashCode() = " + i.hashCode());
        System.out.println("strA.hashCode() = " + strA.hashCode());
        System.out.println("strAB.hashCode() = " + strAB.hashCode());

        //value of hashCode can be minus number
        System.out.println("-1.hashCode() = " + Integer.valueOf(-1).hashCode());

        Member memberA1 = new Member("idA");
        Member memberA2 = new Member("idA");

        //non-overriding of methods of equals and hashCode
        System.out.println("memberA1 == memberA2: " + (memberA1 == memberA2));
        System.out.println("memberA1 equals memberA2: " + (memberA1.equals(memberA2)));
        System.out.println("memberA1.hashCode() = " + memberA1.hashCode());
        System.out.println("memberA2.hashCode() = " + memberA2.hashCode());
    }
}
