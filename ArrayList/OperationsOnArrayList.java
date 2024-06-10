package ArrayList;
import java.util.*;
public class OperationsOnArrayList {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        ArrayList<Integer> arr1 = new ArrayList<>();

        // add
        arr1.add(10);
        arr1.add(20);
        arr1.add(30);
        arr1.add(40);
        // System.out.println(arr1);
        
        // add at index (I need to add 25 at 2nd index)
        arr1.add(2,25);
        // System.out.println(arr1);

        // get
        // System.out.println(arr1.get(4));

        // set
        arr1.set(1,12);
        // System.out.println(arr1);

        // remove
        arr1.remove(1);
        System.out.println(arr1);

        // size
        System.out.println(arr1.size());
    }

}
