import java.util.*;

public class Intialize {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
         
        int num[] = new int[100];
        num[0] = sc.nextInt();
        num[1] = sc.nextInt();
        num[2] = sc.nextInt();

        System.out.println("first  "  + num[0]);
        System.out.println("second  "  + num[1]);
        System.out.println("third  "  + num[2]);
    }
}
