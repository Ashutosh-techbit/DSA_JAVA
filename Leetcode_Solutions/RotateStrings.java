public class RotateStrings{

        public static boolean rotateString(String s, String goal) {
            int n=s.length();
            int k=0;
            for(int i=0;i<n;i++){
                if(goal.charAt(0)==s.charAt(i)){
                     k=i;
                    break;
                }
            }

            System.out.println(k);
            int j=0;
            for(int i=0;i<n;i++)
            {
                 if(s.charAt(k)==goal.charAt(j)  )
                 {
                    j++;
                    
                    k++;
                }
                else{
                    return false;
                }
                
                System.out.println("j" + j);
                System.out.println("k" + k);
                if(k==n-1){
                    k=k-n+1;
                }
            }
            return true;
        }
     
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        boolean result = rotateString(s,goal);
        System.out.println(result);

    }
}