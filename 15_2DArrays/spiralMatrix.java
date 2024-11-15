public class spiralMatrix {

    public static void spiralMatrix(int nums[][]){

         int minrow=0;
         int mincol=0;
         int maxrow=nums.length-1;
         int maxcol=nums[0].length-1;

        while(minrow<=maxrow && mincol<=maxcol)
        {
            //top
            for(int i=mincol;i<=maxcol;i++){
                System.out.print(nums[minrow][i] + " ");
            }
            System.out.println();

            //right
            for(int i=minrow+1;i<=maxrow;i++){
                System.out.print(nums[i][maxcol] + " ");
            }
            System.out.println();

            //bottom
            for(int i=maxcol-1;i>=mincol;i--){
                System.out.print(nums[maxrow][i] + " ");
            }
            System.out.println();

            //left
            for(int i=maxrow-1;i>=minrow;i--)
            {
                System.out.print(nums[i][mincol] + " ");
            }

         }
    }
    
    public static void main(String[] args) {
        int nums[][]={{0,1,2,3},{4,5,6,7},{8,9,10,11},{12,13,14,15}};

        spiralMatrix(nums);

    //  for(int i=0;i<4;i++){
    //     for(int j=0;j<4;j++){
    //         System.out.println(nums[i][j]);
    //     }
    //  }
    }
}
