package collection.link;

public class Node {

    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }



/*
    //auto-constructed toString overriding by IDE
    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }
*/

/*
    // which I have tried to make my own
    @Override
    public String toString() {
        return "[ " + this.item.toString() + hasNext(this.next);
    }

    private String middle() {
        return this.item.toString() + hasNext(this.next);
    }

    private String hasNext(Node next) {
        if (next != null) {
            return " -> " + next.middle();
        }
        return " ]";
    }
*/

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node x = this;
        sb.append("[ ");
        while (x.next != null) {
            sb.append(x.item);
            sb.append(" -> ");
            x = x.next;
        }
        sb.append(x.item);
        sb.append(" ]");
        return sb.toString();
    }
}
