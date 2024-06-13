package Recursion;
import java.util.*;

public class printIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        increasingOrder(n);
    }
    static void increasingOrder(int n){
        if(n == 0){
            return;
        }
        increasingOrder(n-1);
        System.out.print(n+" ");
        // increasingOrder(n-1); ==> for decreasing order
    }
}
