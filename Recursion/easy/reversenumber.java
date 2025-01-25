public class reversenumber {
    static int sum=0;
    public static void rev1(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        sum=sum*10 + rem;
        rev1(n/10);

    }
 public static void main(String[] args) {
     rev1(1875);
     System.out.println(sum);   
 }
    
}