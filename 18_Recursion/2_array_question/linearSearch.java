import java.util.ArrayList;

public class linearSearch {

    // check element exists or not
    public static boolean linearSearch(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }

        if (arr[index] == target) {
            return true;
        } else {
            return linearSearch(arr, target, index + 1);
        }
    }
    
    
    // index of element
    public static int findindex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        } else {
            return findindex(arr, target, index + 1);
        }
    }
   

    // returns index of multiple occurence of element if exists 
    public static ArrayList<Integer> findallindex(int[] arr, int target, int index  , ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        
        if (arr[index] == target) {
            list.add(index);
        }
        return findallindex(arr, target, index + 1,list);
    }
    
    
    // returns index of multiple occurence of element if exists by creating new list at every recursion call
    public static ArrayList<Integer> findallindex2(int[] arr, int target, int index ) {

        ArrayList<Integer> list2 = new ArrayList<>();

        if (index == arr.length) {
            return list2;
        }
        
        //this will contain answer for that function call only
        if (arr[index] == target) {
            list2.add(index);
         }
         ArrayList<Integer> ansfromBelowCall = findallindex2(arr, target, index+1);
         list2.addAll(ansfromBelowCall);
        return list2;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 34, 65, 13, 12 ,12};
        System.out.println(linearSearch(arr, 65, 0));
        System.out.println(findindex(arr, 65, 0));

       ArrayList<Integer> ans = findallindex(arr, 12, 0,new ArrayList<Integer>());
        System.out.println(ans);
    }
}
