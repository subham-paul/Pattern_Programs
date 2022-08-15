
/* 
Hit a number -> 5
1 1 1 1 1 
0 0 0 0 0
1 1 1 1 1 
0 0 0 0 0
1 1 1 1 1 */
import java.util.Scanner;

public class Pattern_23 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hit a number -> ");
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print((row % 2) + " ");
            }
            System.out.println();
        }
    }
}
