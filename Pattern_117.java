/* 
****
 ***
  **
   *
 */

public class Pattern_117 {
    public static void main(String args[]) {
        int n = 5;
        for (int row = n; row >= 1; row--) {
            for (int space = n - 1; space >= row; space--) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}