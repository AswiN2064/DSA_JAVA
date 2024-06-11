package Sorting;
import java.util.*;

public class bubbleSort {
    public static void main(String[] args) {
        int [] arr = {4,6,8,3,9,-1,5,2};

        for(int i = arr.length; i >= 0; i--){
            for(int j = 0; j < i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
