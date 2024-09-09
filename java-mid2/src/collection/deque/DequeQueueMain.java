package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeQueueMain {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        //Deque<Integer> deque = new LinkedList<>();

        //add data
        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        System.out.println(deque);

        // check the datum which will be picked up in next
        System.out.println("deque.peek() = " + deque.peek());

        // take out data
        System.out.println("deque.poll() = " + deque.poll());
        System.out.println("deque.poll() = " + deque.poll());
        System.out.println("deque.poll() = " + deque.poll());
        System.out.println(deque);
    }
}
