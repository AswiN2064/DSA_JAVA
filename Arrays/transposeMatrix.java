package Arrays;
import java.util.Scanner;

public class transposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of Cols: ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println();

        // Setting 2d array
        System.out.println("Enter the Elements of 2-d Array");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println();

        // original matrix
        System.out.println("Traversing an 2d array:");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        //  Transpose a Matrix
        for(int i = 0; i < row; i++){
            for(int j = 0; j <= i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Treversing the matrix
        System.out.println("Traversing an transposed 2d array:");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
