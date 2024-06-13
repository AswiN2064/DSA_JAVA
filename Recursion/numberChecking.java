package Recursion;

public class numberChecking {
    public static void main(String[] args) {
        int[] arr = {10,24,0,54,54,4,57,68,69,31};
        int num = 54;
        System.out.println(check(arr, arr.length-1, 0, num));
    }
    static int check(int[] arr, int n, int i, int x){
        if(i == n){
            return -1;
        }
        if(arr[i] == x){
            return i;
        }else{
            return check(arr, n, i+1, x);
        }
    }
}
