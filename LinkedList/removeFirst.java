package LinkedList;

import java.util.*;

public class removeFirst {

    public static class Node{
        int data;
        Node next;
    }

    public static Node creatingLL(){
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

        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node head = creatingLL();

        // System.out.println("Original Linked List");
        // while(head != null){
        //     System.out.print(head.data + " ");
        //     head = head.next;
        // }
        // System.out.println();

        removeNode(head);

    }

    public static void removeNode(Node head){
        head = head.next;
        
        System.out.println("Processed Linked List");
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
}
