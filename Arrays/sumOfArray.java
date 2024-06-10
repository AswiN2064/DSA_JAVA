/*
 * Sample input:
 * 8
 * 10 3 -1 -8 7 12 3 15
 *
 * Sample Output:
 * 41
 */

package Arrays;
import java.util.Scanner;
public class sumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;

        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            sum += arr[i];
        }

        System.out.println("Sum of the elements of the array: " + sum);
    }
}
