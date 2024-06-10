/*
 * Sample input:
 * 8
 * 5 10 -1 14 -7 21 -3 1
 * 
 * Sample Output:
 * 21
 */
package Arrays;
import java.util.Scanner;

public class maxOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the Elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }else{
                continue;
            }
        }
        System.out.println("Maximum Number in the Array is "+max);
    }
}
