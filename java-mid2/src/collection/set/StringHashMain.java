package collection.set;

public class StringHashMain {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        //char
        char charA = 'A';
        char charB = 'B';
        System.out.println("charA = " + (int)charA);
        System.out.println("charB = " + (int)charB);

        //hashCode
        System.out.println("hashCode(\"A\") = " + hashCode("A"));
        System.out.println("hashCode(\"B\") = " + hashCode("B"));
        System.out.println("hashCode(\"AB\") = " + hashCode("AB"));

        //hashIndex
        int hashCodeA = hashCode("A");
        int hashIndexA = hashIndex(hashCodeA);
        System.out.println("hashIndexA = " + hashIndexA);
        int hashCodeB = hashCode("B");
        int hashIndexB = hashIndex(hashCodeB);
        System.out.println("hashIndexB = " + hashIndexB);
    }

    static int hashCode(String string) {
        char[] charArray = string.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += c;
        }
        return sum;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
