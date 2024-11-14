public class Countingsort {

    public static void Counting(int nums[]){

        //finding maximum element of array
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }

        //creating array which shows how many time an element occur in nums[]
        int freqarr[] = new int[max+1];

        for(int i=0;i<freqarr.length;i++){
            freqarr[nums[i]]++;
        }

        int j=0;
        for(int i=0;i<freqarr.length;i++){
                 while(freqarr[i]>0){
                    nums[j]=i;
                    j++;
                    freqarr[i]--;
                 }
            }
        }
    
    public static void main(String[] args) {
        int nums[] = {1,4,2,4,6,1,3};
        Counting(nums);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
                    