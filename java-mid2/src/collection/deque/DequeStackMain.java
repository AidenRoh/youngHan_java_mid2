package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStackMain {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        //Deque<Integer> deque = new LinkedList<>();

        // add data
        deque.push(1);
        deque.push(2);
        deque.push(3);
        System.out.println(deque);

        // check the datum which will be picked up in next
        System.out.println("deque.peek() = " + deque.peek());

        // take out data
        System.out.println("deque.pop() = " + deque.pop());
        System.out.println("deque.pop() = " + deque.pop());
        System.out.println("deque.pop() = " + deque.pop());
        System.out.println(deque);
    }
}
