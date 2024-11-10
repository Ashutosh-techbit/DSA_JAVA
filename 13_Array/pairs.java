//no. of pairs of n integer in an array is n(n-1)/2
//TC=O(n^2)

public class pairs {
    public static void pair(int nums[]) {
        int pairs[] = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            pairs[0] = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                pairs[1] = nums[j];
                System.out.println(pairs[0] + " " + pairs[1]);
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 2, 4, 6, 8, 10 };
        pair(nums);
    }
}
