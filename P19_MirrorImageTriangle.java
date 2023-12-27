/* 
Here is the Mirror Image Triangle pattern 
1 2 3 4 5 
 2 3 4 5 
  3 4 5 
   4 5 
    5 
   4 5 
  3 4 5 
 2 3 4 5 
1 2 3 4 5 
 */

import java.util.Scanner;

public class P19_MirrorImageTriangle {
    public static void printPattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col < row; col++) {
                System.out.print(" ");
            }
            for (int col = row; col <= n; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        for (int row = n - 1; row >= 1; row--) {
            for (int col = 1; col < row; col++) {
                System.out.print(" ");
            }
            for (int col = row; col <= n; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        // Scanner sc =new Scanner(System.in);
        // System.out.print("Enter a number -> ");
        // int n = sc.nextInt();
        System.out.println("Here is the Mirror Image Triangle pattern ");
        printPattern(n);
    }
}
