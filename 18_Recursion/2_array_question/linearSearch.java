public class linearSearch {

    //check element exists or not
    public static boolean linearSearch(int[] arr , int target , int index){
        if(index == arr.length){
            return false;
        }

        if(arr[index]==target){
            return true;
        }
        else{
            return linearSearch(arr, target, index+1);
        }
    }

    //index of element
    public static int findindex(int[] arr , int target , int index){
        if(index == arr.length){
            return -1;
        }

        if(arr[index]==target){
            return index;
        }
        else{
            return findindex(arr, target, index+1);
        }
    }

     public static void main(String[] args) {
        int[] arr ={1,34,65,13,12};
        System.out.println(linearSearch(arr, 65, 0));
        System.out.println(findindex(arr, 65, 0));
     }    
}
