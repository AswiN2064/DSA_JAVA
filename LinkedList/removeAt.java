package LinkedList;

import java.util.*;

public class removeAt {
    
    public static class Node{
        int data;
        Node next;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index of the LL ==> ");
        int index = sc.nextInt();

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
        Node originalHead = head;
        System.out.println("Oringinal Linked List");
        printLL(originalHead);
        System.out.println("removed Linked List");
        removeAtLL(originalHead, index);
    }

    public static void printLL(Node head){
        
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }

    public static Node removeAtLL(Node head, int ind){
        Node temp = head;
        int counter = 0;
        while(temp!=null){
            System.out.print(temp.data + " ");
            if(counter == ind-1){
                temp = temp.next.next;
            }else{
                temp = temp.next;
            }
            counter++;
        }
        System.out.println();
        // System.out.println("Head check => "+head.data);
        return head;
    }

}
