package LinkedList;
import java.util.*;

public class AddAtLL {

    public static class Node{
        int data;
        Node next;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index value: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of the node: ");
        int data = sc.nextInt();

        // Node Creation
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

        Node newNode = createNode(data);

        insertNode(head, n, newNode);
    }

    public static Node createNode(int data){
        Node newNode = new Node();
        newNode.data = data;
        return newNode;
    }

    public static void insertNode(Node head, int n, Node newNode){
        
        int ind = 0;

        while(head != null){
            System.out.println(ind + " => " + head.data);
            if(ind == n-1){
                Node temp = head.next;
                head = newNode;
                head.next = temp;
            }else{
                head = head.next;
            }
            ind++;
        }
    }
}
