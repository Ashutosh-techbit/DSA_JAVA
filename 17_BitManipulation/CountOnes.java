public class CountOnes {
     public static int ones(int n){
        int count =0;
        while(n>0){
           if((n&1)!=0){
            count++;
           }
           n = n >> 1;
        }
        return count;
     }
     public static void main(String[] args) {
        int ans= ones(9);
        System.out.println(ans );
     }
}
