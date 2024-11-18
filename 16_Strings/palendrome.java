public class palendrome {

    public static boolean ispalindrome(String str){
        int n=str.length();
        boolean ans= true;
        for(int i=0;i<n/2;i++){
           if(str.charAt(i)==str.charAt(n-i-1)){
            continue;
           }    
           else{
               ans=false;
               break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(ispalindrome(str));
    }
}
