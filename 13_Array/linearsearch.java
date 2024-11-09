public class linearsearch {

    public static int linear(int nums[],int key){
        for(int i=0;i<nums.length;i++){
                if(nums[i]==key){
                     return  i;
                }
            }
            return -1;
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6};
        int key=3;

        int result = linear(nums, key);
        System.out.println(result);
      }    
}
