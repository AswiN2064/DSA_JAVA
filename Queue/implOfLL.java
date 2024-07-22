package Queue;

import java.util.LinkedList;

public class implOfLL {
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();

        queue.addFirst(10);
        queue.addFirst(20);
        queue.addFirst(30);
        queue.addFirst(40);
        queue.addFirst(50);

        while(queue.size()!=0){
            System.out.print(queue.removeLast() + " ");
        }
    }
}
