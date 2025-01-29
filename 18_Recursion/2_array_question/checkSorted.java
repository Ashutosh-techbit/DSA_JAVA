//check whether an array is sorted or not 

public class checkSorted {

    //using helper so that user dont need to pass index
    private static boolean helper(int arr[],int index){
        if(index==arr.length-1){
            return true ;
        }
        return arr[index]<=arr[index+1] && helper(arr, index+1);
    }
    //sorted fucntion
    public static boolean sorted(int arr[]){
        return helper( arr, 0);
    }

   public static void main(String[] args) {
    int arr[] = {1,3,4,7,5};
    System.out.println(sorted(arr));
   }    
}
