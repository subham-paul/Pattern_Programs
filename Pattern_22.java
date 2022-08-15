
/* 0 0 0 0 
1 1 1 1 
0 0 0 0 
1 1 1 1
0 0 0 0 */
import java.util.Scanner;

public class Pattern_22 {
    public static void main(String args[]) {
        // int n = 5;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number -> ");
        int n = sc.nextInt();
        for (int row = 0; row < n; row++) {
            for (int col = 1; col < n; col++) {
                System.out.print((row % 2) + " ");
            }
            System.out.println();
        }
    }
}
