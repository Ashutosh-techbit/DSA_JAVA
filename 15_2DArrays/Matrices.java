import java.util.*;

public class Matrices{
    public static void main(String[] args) {
        int matrices[][] = new int[3][3];
        int n= matrices.length , m = matrices[0].length;

        Scanner sc = new Scanner(System.in);
        for(int j=0;j<m;j++){
                for(int i=0;i<n;i++){
                matrices[i][j]=sc.nextInt();
            }
        }
        
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                System.out.print(matrices[i][j] + " ");
                
            }
            System.out.print("\n");
    }
    }
}