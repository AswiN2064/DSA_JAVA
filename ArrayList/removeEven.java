package ArrayList;
import java.util.*;

public class removeEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Elments: ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("Enter the elements of the arrayList: ");
        for(int i = 0; i<n; i++){
            int num = sc.nextInt();
            arr.add(num);
        }

        System.out.println("Original Array: "+arr);
        
        for(int i = arr.size() - 1; i >= 0; i--){
            if(arr.get(i)%2 == 0){
                arr.remove(i);
            }
        }

        System.out.println("Removed Array: "+ arr);
    }
}
