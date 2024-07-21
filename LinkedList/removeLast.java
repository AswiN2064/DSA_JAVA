package LinkedList;

// import Arrays.sumOfArray;

public class removeLast {
    public static class Node{
        int data;
        Node next;
    }
    public static void main(String[] args) {
        // Creating a LinkedList
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node();
        Node n5 = new Node();

        // Data for the Node
        n1.data = 10;
        n2.data = 20;
        n3.data = 30;
        n4.data = 40;
        n5.data = 50;

        // Linking with Other Nodes
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        Node head = removeLastNode(n1);

        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();

    }

    public static Node removeLastNode(Node head){
        if(head == null && head.next == null){
            return null;
        }

        Node temp = head;

        System.out.println("removeLastNode");
        while(temp.next.next != null){
            temp = temp.next;
        }

        temp.next = null;
        return head;
    }
}
