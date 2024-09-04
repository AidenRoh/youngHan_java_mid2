package collection.list;

public class MyLinkedList<T> implements MyList<T> {

    private Node<T> first;
    private int size = 0;

    @Override
    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (first == null) {
            first = newNode;
        } else {
            Node<T> lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    // add code
    @Override
    public void add(int index, T element) {
        Node<T> newNode = new Node<>(element);
        if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else {
            Node<T> prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    // add code
    @Override
    public T remove(int index) {
        Node<T> removedNode = getNode(index);
        T removedItem = removedNode.item;
        if (index == 0) {
            first = removedNode.next;
        } else {
            Node<T> prev = getNode(index - 1);
            prev.next = removedNode.next;
        }
        removedNode.item = null;
        removedNode.next = null;
        size--;
        return removedItem;
    }

    @Override
    public T set(int index, T element) {
        Node<T> x = getNode(index);
        T oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    @Override
    public T get(int index) {
        Node<T> node = getNode(index);
        return node.item;
    }

    @Override
    public int indexOf(T element) {
        int index = 0;
        for (Node<T> x = first; x != null; x = x.next) {
              if (element.equals(x.item)) {
                  return index;
              }
              index++;
        }
        return -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String  toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }

    private Node<T> getLastNode() {
        Node<T> x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    private Node<T> getNode(int index) {
        Node<T> x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    private static class Node<T> {
        T item;
        Node<T> next;

        public Node(T item) {
            this.item = item;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<T> x = this;
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
}
