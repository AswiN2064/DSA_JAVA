package LinkedList;

import java.util.Scanner;

public class searchLL {
    public static class Node{
        int data;
        Node next;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value to be searched ==> ");
        int k = sc.nextInt();

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
        System.out.println(search(head, k));
    }

    public static boolean search(Node head, int k){
        while(head!=null){
            if(head.data == k){
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
