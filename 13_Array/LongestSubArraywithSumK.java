public class LongestSubArraywithSumK {
    public static int longestSubarray(int[] arr, int k) {

        int result = 0;
        int left = 0;
        int right = left+1;
        int sum =  0;
        int len = 1;
        
        for(int i=0;i<arr.length-1;i++){
            sum =0;
            sum = sum+arr[i];
            for(int j =i+1;j<arr.length;j++){
                if(sum == k){
                    len = j-i+2;
                    result = Math.max(result, len);
                }
                sum = sum +arr[j];
            }
        }
        
        return result;
        


































        // while(right<arr.length && left<right){
        //     sum = sum + arr[right];
          
        //     if(k<sum){
        //         left++;
        //         sum=0;
        //         sum=sum+arr[left];
        //     }
        //     if(sum==k){
        //         len = right-left+1;
        //         result = Math.max(result,len);
        //     }
        //     right++;
        // }
        
        
    }
    public static void main(String[] args) {
        int[] arr = {10, 5 ,2 ,7, 1, -10};
        int result = longestSubarray(arr,15);
        System.out.println(result);

    }
}
