public class selectionsort{ 
    public static void selection(int nums[])
    {
        for(int i=0;i<nums.length-1;i++){
              int mini = i;
                 for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[mini]){
                    mini=j;
                }
            }
                int temp = nums[mini];
                nums[mini]=nums[i];
                nums[i]=temp;
              }
            }    
    
    public static void main(String[] args) {
        int nums[]={4,2,1,5,3,1};
        selection(nums);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}