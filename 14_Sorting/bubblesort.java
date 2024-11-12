public class bubblesort {

    // Bubble sort
    public static void bubble(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1-i;j++){
            if(nums[j]>nums[j+1]){
                int temp = nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=temp;
            }
          }
        }
    }
    public static void main(String[] args) {
        int nums[]= {1,5,3,2,1,7};
        bubble(nums);
        for(int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]);
        }
    }
}
