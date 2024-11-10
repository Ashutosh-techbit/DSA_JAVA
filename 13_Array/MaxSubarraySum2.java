// max sum using a prefix array 
//TC = O(n^3)
public class MaxSubarraySum2 {

    public static int maxsum(int nums[]){

        int sum=0;
        int ans=Integer.MIN_VALUE;

        //intialze array
        int prefix[] = new int[nums.length];
        
        // array declaration
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
           prefix[i]=prefix[i-1]+nums[i]; 

        }


        for(int i=0;i<nums.length;i++){
            int start=i;
            for(int j=i;j<nums.length;j++){
            int end=j;

            //check if start=0 then result will be the end index value
            sum= start==0 ? prefix[end] : prefix[end]-prefix[start-1];
            ans= Math.max(ans,sum);
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int nums[]= {-1,2,3,-3,9};
        int result = maxsum(nums);
        System.out.println(result);
    }
}
