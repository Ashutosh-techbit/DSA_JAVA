public class diagonalsum {

    // function to print both daigonals sum of a matrix
    public static int diagonalsum(int nums[][]) {
        int sum = 0;

        // =============BRUTE FORCE[O(N^2)]====================
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = 0; j < nums[0].length; j++) {
        //         // left daigonal
        //         if (i == j) {
        //             sum += nums[i][j];
        //         }

        //         // rigth diagonl
        //         if (i + j == nums.length - 1) {
        //             sum += nums[i][j];
                    
        //         }
        //     }
        // }
        
        
        // ===============Optimised Approach[O(N^2)]=============
        for(int i=0;i<nums.length;i++){
            sum+=nums[i][i];

            //as per calculation i+j=nums.lenght-1 
            // so ====> j=nums.length-1-i <=====
            
            //if condition removes the overlapping of center element
            if(i != nums.length-1-i)
            sum+=nums[i][nums.length-1-i];

        }
        
        
        
        return sum;
    }

    public static void main(String[] args) {
        int nums[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int result = diagonalsum(nums);
        System.out.println(result);

    }

}
