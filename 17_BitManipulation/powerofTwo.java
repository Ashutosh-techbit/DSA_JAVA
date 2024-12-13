public class powerofTwo {
    //check power of 2 or not
    public static boolean power2(int n){
        if((n&(n-1))==0)
        return true;
        else
        return false;
    }
    public static void main(String[] args) {
        //check power of 2
        // boolean ispowerof2 = power2(16); //true
        boolean ispowerof2 = power2(12); //false
        System.out.println(ispowerof2);

    }

    
}
