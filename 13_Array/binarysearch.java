public class binarysearch {

    public static int binsearch(int nums[],int key){
        int start=0,end=nums.length-1;
        
        while(start<end){
            int mid=(start+end)/2;
             if(nums[mid]==key){
                return mid;
             }
             else if(mid>key){
                 end=mid-1;
             }
             else{
                start=mid+1;
             }

        }

        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,34,45,33,22};
       int result= binsearch(nums, 33);
       System.out.println(result);
    }
}
