public class palindrome {

    public static int palin(int n){
        int len = (int)(Math.log10(n)+1);
        //use helper function when u have to use two values but user gave only one
        return helper(n,len);
            }
        
    private static int helper(int n , int len){
        if(n%10==0){
            return 0;
        }
        int rem = n%10;
        return rem * (int)(Math.pow(10, len-1)) + helper(n/10, len-1);
    }
    public static void main(String[] args) {
        System.out.println(palin(1234));
    }    
}
