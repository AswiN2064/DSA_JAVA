package LinkedList;

public class lengthOfLL{
    
    public static class Node{
        int data;
        Node next;
    }

    public static void main(String[] args){
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node();
        Node n5 = new Node();

        n1.data = 10;
        n2.data = 20;
        n3.data = 30;
        n4.data = 40;
        n5.data = 50;

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        Node head = n1;
        int len = lengthOfLinkedList(head);

        System.out.println(len);
    }

    public static int lengthOfLinkedList(Node head){
        int len = 0;
        while(head!=null){
            len++;
            head = head.next;
        }
        return len;
    }
}
