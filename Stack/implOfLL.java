package Stack;

import java.util.*;

public class implOfLL {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();

        stack.addFirst(10);
        stack.addFirst(20);
        stack.addFirst(30);
        stack.addFirst(40);
        stack.addFirst(50);

        while(stack.size()!=0){
            System.out.print(stack.removeFirst()+" ");
        }
    }
}
