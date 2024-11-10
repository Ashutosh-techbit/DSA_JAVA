//finding the maximum sum of a subarray using Kadane's algo.
//if the cureent sum will become negative after adding the value at index i then take currentsum as 0 at that index.
// this works only when sum is positve 

public class MaxSubarraySum {
    public static int kadanes(int nums[]){
        int sum=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            sum = sum+nums[i];
            sum= sum<0 ? 0:sum;
            ans=Math.max(ans, sum);
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] ={-2,-1,-5,-3};
        int result= kadanes(nums);
        System.out.println(result);
    }
}
