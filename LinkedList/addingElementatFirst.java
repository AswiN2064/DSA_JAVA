package LinkedList;

public class addingElementatFirst {
    
    public static class Node {
        int data;
        Node next;

        /*
         * Node (int val){
         *     this.data = val;
         * }
         */
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

        Node n5 = new Node();
        n4.next = n5;
        n5.data = 50;

        Node Head = n1;
        Head = addElement(Head, 60);

        Node temp = Head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static Node addElement(Node Head, int val){
        Node n = new Node();
        n.data = val;
        n.next = Head;
        Head = n;
        return Head;
    }

}
