package Stack;

import java.util.*;

public class OperationsInStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        //adding elements in stack --> push()
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        //getting the top most element in stack --> peek()
        System.out.println(".peek() -> "+st.peek());

        //removing and returning the last elemnt in the stack --> pop()
        System.out.println(".pop() -> "+st.pop());

        //getting Size of the stack --> size()
        System.out.println(".size() -> "+st.size());
    }
}

