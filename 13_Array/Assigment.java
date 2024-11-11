import java.util.*;

public class Assigment {

    //return true if any value in array repeat more than once
    public static boolean repeat(int nums[]){
        Arrays.sort(nums);
        boolean ans = false;
        int a = nums[0];
         for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                ans=true;
            }
         }     
        return ans;
    }

    
    public static void main(String[] args) {
        int nums[] ={1,16,32,6};
        boolean result = repeat(nums);
        System.out.println(result);
    }
}
