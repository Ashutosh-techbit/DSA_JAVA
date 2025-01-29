public class productofdigits {
    public static int prod(int x){
        if(x%10==x){
            return x;
        }
        return prod(x/10) * (x%10);
    }
    
    public static void main(String args[]){
       int result = prod(153);

       System.out.println(result);
    }
}
