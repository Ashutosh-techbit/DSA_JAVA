//finding maximum sum of an subarray using bruteforce appraoch 
// TC = O(n^3)


public class MaxSubarraySum1 {

    public static int maxsum(int nums[]){

        int sum=0;
        int ans= Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
              int start=i;
            for(int j=i;j<nums.length;j++){
                 int end =j;
                 sum=0;
             for(int k =start;k<=end;k++){  
                   sum+=nums[k];
                    ans=Math.max(ans,sum);
                }
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int nums[] = {1,-2,3,4};
        int result = maxsum(nums);
        System.out.println(result);

    }
}
