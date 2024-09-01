package collection.link;

public class NodeMain3 {

    public static void main(String[] args) {
        // Construct Node and connect each other: A -> B -> C

        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        // search all exist nodes
        printAll(first);

        // search last node
        Node lastNode = getLastNode(first);

        // search target node
        int index = 2;
        Node node2index = getNode(first, index);
        System.out.println("node2index = " + node2index.item);

        // add new data
        System.out.println("add data");
        addNode(first, "D");
        System.out.println(first);
        addNode(first,"E");
        System.out.println(first);
        addNode(first,"F");
        System.out.println(first);

    }

    private static void printAll(Node node) {
        Node x = node;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }

    private static Node getLastNode(Node node) {
        Node x = node;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    private static Node getNode(Node node, int index) {
        Node x = node;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    private static void addNode(Node node, String item) {
        getLastNode(node).next = new Node(item);
    }
}
