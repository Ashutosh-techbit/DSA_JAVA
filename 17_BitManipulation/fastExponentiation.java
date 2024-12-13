public class fastExponentiation {
    public static int fastexpo(int n,int power){
        int ans=1;
        while(power>0){
            if((power&1)!=0){
                ans=ans*n;

            }
            n=n*n;
           power = power>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int result = fastexpo(3, 5);
        System.out.println(result);
    }
}
