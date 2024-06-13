package Recursion;

public class factorial {
    public static void main(String[] args) {
        int n = 4;
        System.out.print(fact(n));
    }
    static int fact(int num){
        if(num == 1){
            return 1;
        }else{
            return num * fact(num-1);
        }
    }
}
