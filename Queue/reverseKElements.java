package Queue;

import java.util.*;

public class reverseKElements {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of K -> ");
        int k = sc.nextInt();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);

        reverse(q, k);
        sc.close();
    }

    public static void reverse(Queue<Integer> queue, int k){
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < k; k++){
            st.push(queue.remove());
        }

        for(int i = 0; i < st.size(); k++){
            queue.offer(st.pop());
        }

        for(int i = 0; i < queue.size() - k; k++){
            queue.offer(queue.remove());
        }

        System.out.println(queue.size());
    }
}
