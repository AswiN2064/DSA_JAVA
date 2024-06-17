package Arrays;
import java.util.*;

public class striding {
    public static void main(String[] args) {
        int arr[] = {1,5,3,4,5,6,7,8};
        Scanner sc = new Scanner(System.in);

        // reading input for n =  array size;
        System.out.println("Enter the Number of Elements of the array: ");
        int n = sc.nextInt();

        // reading input for array;
        System.out.println("Enter the Elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // reading Stride input;
        System.out.println("Enter the value of Stride: ");
        int stride = sc.nextInt();

        for(int i = 0; i <= arr.length - stride; i++){
            System.out.println("Interation no :" + (i + 1));
            ArrayList<Integer> arrNew = new ArrayList<>();
            arrNew = getArray(arr, stride, i);
            System.out.println(arrNew);
            int max = getMax(arrNew);
            System.out.println(max);
        }
    }

    static ArrayList<Integer> getArray(int[] arr, int stride, int from){
        ArrayList<Integer> arrNew = new ArrayList<>();
        for(int i = from; i < stride + from; i++){
            arrNew.add(arr[i]);
        }
        return arrNew;
    }

    static int getMax(ArrayList<Integer> arr){
        int max = arr.get(0);
        for(int j = 0; j < arr.size(); j++){
            if(arr.get(j) > max){
                max = arr.get(j);
            }
        }
        return max;
    }
}
