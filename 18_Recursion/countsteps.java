//leetcode 1342
public class countsteps 
{

    private static int helper(int num, int count) {
        if (num == 0) {
            return count;
        }
        if (num % 2 == 0) {
            return helper(num / 2, count+1);
        }
        return helper(num-1  , count+1);
    }

    public static int numberOfSteps(int num) {
        return helper(num, 0);
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }

}