package Arrays;
import java.util.Scanner;
public class subarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the Elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int start_ind;
        int end_ind;

        System.out.println("The subarrays of the arrays are: ");
        for(start_ind = 0; start_ind < n; start_ind++){
            for(end_ind = start_ind; end_ind < n; end_ind++){
                for(int k = start_ind; k <= end_ind; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
