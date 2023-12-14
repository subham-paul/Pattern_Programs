/* 
Here is the Diamond Star
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 */
public class P9_DiamondStar {
    public static void printDiamondStar(int n) {

        // outer loop to handle upper part
        for (int row = 1; row <= n; row++) {
            for (int s = 1; s <= n - row; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // outer loop to handle lower part
        for (int row = n - 1; row >= 1; row--) {
            for (int s = 1; s <= n - row; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Here is the Diamond Star");
        printDiamondStar(n);
    }
}
