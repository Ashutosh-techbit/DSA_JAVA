
public class binarySearch {
    public static int binsearch(int arr[] , int target , int start ,  int end){
        if(start>end){
            return -1;
        }
        int mid = (start +(end - start)/2);
        if(arr[mid]==target){
            return mid;
        }

        else if(target < arr[mid]){
            end=mid-1;
           return binsearch(arr, target, start, end);
        }
        else{
            start=mid+1;
            return binsearch(arr, target, start, end);
        }
        
    }
    public static void main(String[] args) {
        int[] arr = {1,3,13,23,53}; //sorted
        int target = 13;
        int k = binsearch(arr, target, 0, arr.length-1);
        System.out.println(k);
    }
}
