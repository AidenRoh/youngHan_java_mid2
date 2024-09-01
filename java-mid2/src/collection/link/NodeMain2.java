package collection.link;

public class NodeMain2 {

    public static void main(String[] args) {
        // Construct Node and connect each other: A -> B -> C

        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println("print node instance: first");
        System.out.println(first);
    }
}
