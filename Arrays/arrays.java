package Arrays;

public class arrays {
    public static void main(String[] args) {
        int arr_0[] = {1,2,3,4,5};

        System.out.println("arr_0 :");
        for(int i = 0; i < arr_0.length; i++){
            System.out.print(arr_0[i]);
        }
        System.out.println();

        //-----------
        int arr_1[] = new int[7];
        System.out.println("arr_1 :");
        for(int i = 0; i < arr_1.length; i++){
            System.out.print(arr_1[i]);
        }
        System.out.println();
    }
}