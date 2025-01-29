public class Fibonacci{
    public static int fibo(int n){
        if(n==0||n==1){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
           int k=fibo(4);        
           System.out.println(k);
    }
}