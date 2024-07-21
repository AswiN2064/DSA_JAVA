package Arrays;

public class twoSum {
    
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        sumInd(arr, target);
        // for(int i = 0; i < out.length; i++){
        //     System.out.print(out[i]);
        // }
    }

    public static void sumInd(int[] nums, int target){
        int[] out = new int[2];
        int[] arr = nums;
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length; j++){
                while(i!=j){
                    if(arr[i] + arr[j] == target){
                        System.out.print(i + " ");
                        System.out.print(j);
                        // out[0] = i;
                        // out[1] = j;
                    }
                    break;
                }
                
            }
        }
        
    }
}
