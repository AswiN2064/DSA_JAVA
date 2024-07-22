package Queue;

import java.util.*;

public class OperationsInQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();    
        
        // Adding elements in the queue -> offer()
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);

        // getting the front element -> peek()
        System.out.println("Front element (or) Accessible element .peek() -> "+q.peek());

        // remove element from the queue -> remove()
        System.out.println(".remove() -> "+q.remove());
        System.out.println("peek after remove -> "+q.peek());

        // size of queue -> size()
        System.out.println(".size() -> "+q.size());
    }
}
