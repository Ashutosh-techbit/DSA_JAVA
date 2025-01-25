package easy;
public class factorial {

    public static int fact(int x){
        if(x==0 || x==1){
            return 1;
        }
         return x * fact(x-1);
    }
    public static void main(String[] args) {
        int x=5;
        int result = fact(x);
        System.out.println(result);
    }
}
