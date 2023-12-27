/* 
     * 
    * * 
   * * * 
  * * * * 
 * * * * * 
* * * * * * 
 */
import java.util.Scanner;

public class P17_TriangleStar {
    public static void printTriangleStar(int n) {
        /*
         * for (int row = 0; row < n; row++) {
         * for (int space = n - row; space > 1; space--) {
         * System.out.print(" ");
         * }
         * for (int col = 0; col <= row; col++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */
        int i, j;
        // outer loop to handle rows
        for (i = 0; i < n; i++) {
            // inner loop to print spaces.
            for (j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            // inner loop to print stars.
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            // printing new line for each row
            System.out.println();
        }
    }

    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number -> ");
        // int n = sc.nextInt();
        int n = 6;
        printTriangleStar(n);
    }
}
