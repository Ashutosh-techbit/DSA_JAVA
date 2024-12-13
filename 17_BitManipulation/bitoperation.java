public class bitoperation {
    // get the bit of given ith(ith value start from 0) position of a number n
    public static int getIthBit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    // set ith bit to 1
    public static int setIthBit(int n, int i) {
        int bitmask = 1 << i;
        int k = 5 | bitmask;
        return k;
    }

    // clear bit to 0 a ith position
    public static int clearBit(int n, int i) {
        int bitmask = ~(1 << i);
        int ans = (n & bitmask);
        return ans;
    }


    //upadate the bit to 0 and 1
    public static int upadatebit(int n, int i ,int newbit){
        int k=clearBit(n, i);
        return (k|(newbit<<i));
    }

    //set all bits till i to 0;
    public static int clearIbits(int n,int i){
        return (n & ((-1)<<i));
    }

    //clear bits to 0 of range i and j
    public static int clearRange(int n , int i,int j){
        int a=((~0)<<(j+1));
        int b=((1<<i)-1);
        int bitmask=a|b;
        return n&bitmask;
    }

    public static void main(String[] args) {

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

    }
}
