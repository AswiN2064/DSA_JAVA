package LinkedList;

public class creatingLL {

    public static class Node {
        int data;
        Node next;
    }
    public static void main(String[] args) {

        // Creating a sample Linked List
        Node n1 = new Node();
        n1.data = 10;

        Node n2 = new Node();
        n1.next = n2;
        n2.data = 20;

        Node n3 = new Node();
        n2.next = n3;
        n3.data = 30;

        Node n4 = new Node();
        n3.next = n4;
        n4.data = 40;

        // traversing a Linked List
        while(n1.next != null){
            System.out.println(n1.data);
            n1 = n1.next;
        }
        while(n1.next == null){
            System.out.println(n1.data);
            break;
        }
    }
}
