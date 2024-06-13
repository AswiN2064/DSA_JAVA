package Recursion;

public class displayArray {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        printArray(arr, arr.length-1);
    }
    static void printArray(int[] arr, int len){
        if(len < 0){
            return;
        }
        printArray(arr, len - 1);
        System.out.print(arr[len]+" ");
    }
}
