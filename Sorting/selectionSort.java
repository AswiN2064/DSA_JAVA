package Sorting;
import java.util.*;
public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {2,8,4,-1,7,10,5,6};
        int temp;

        for(int i = 0; i < arr.length; i++){
            int minVal = arr[i];
            int minInd = i;
            for(int j = i+1; j < arr.length; j++){
                if(minVal > arr[j]){
                    minVal = arr[j];
                    minInd = j;
                }
            }
            temp = arr[i];
            arr[i] = minVal;
            arr[minInd] = temp;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
