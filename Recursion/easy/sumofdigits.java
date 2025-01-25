package easy;
public class sumofdigits {
    public static int sum(int x){
        if(x<1){
            return 0;
        }
        return sum(x/10) + (x%10);
    }

    public static void main(String args[]){
       int result = sum(123);
       System.out.println(result);
    }
}
