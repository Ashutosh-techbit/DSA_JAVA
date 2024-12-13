public class operator {
    
    //check power of 2 or not
    public static boolean power2(int n){
        if((n&(n-1))==0)
        return true;
        else
        return false;
    }
    public static void main(String[] args) {
        System.out.println(5 & 9); // AND
        System.out.println(5 | 9); // OR
        System.out.println(5 ^ 6); // XOR
        System.out.println(~12); // Binary complement
        System.out.println(5 << 2); // Binary left shift
        System.out.println(5 >> 2); // Binary right shift

        // result is 1 if odd , 0 for even
        System.out.println(2 & 1); // check even or odd
        System.out.println(7 & 1); // check even or odd

        // get ith bit of number n
        int result = getIthBit(5, 0); // 5->101
        int result1 = getIthBit(5, 1); // 5->101
        System.out.println(result); // 1
        System.out.println(result1); // 0

        // set ith bit to 1
        int ans = setIthBit(5, 1);
        System.out.println(ans);

        //clear bit
        int a=clearBit(5, 2);
        System.out.println(a);

        //update bit
        int s=upadatebit(5, 1, 1);
        System.out.println(s);

        //clear all bits till i
        int cb=clearIbits(15, 2);
        System.out.println(cb);

        //clear range
        int cr = clearRange(10, 2, 4);
        System.out.println(cr);

        //check power of 2
        // boolean ispowerof2 = power2(16); //true
        boolean ispowerof2 = power2(12); //false
        System.out.println(ispowerof2);

    }
}
