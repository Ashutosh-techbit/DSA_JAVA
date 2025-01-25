package easy;
public class basics{
   
    //recursion 
    static void print(int n){
        //base condition to stop recursion
         if(n==6){
              return;
         }
       System.out.println(n);
       print(n+1);
    }
    public static void main(String[] args) {
        int n=1;
        print(n);
    }
}
