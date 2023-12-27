/* 
    *
   * *
  *   *
 *     *
*********
 */
public class P20_HollowTriangle {
    public static void printPattern(int n) {
        int row, col, space;
        for (row = 1; row <= n; row++) {
            for (col = row; col < n; col++) {
                System.out.print(" ");
            }
            for (space = 1; space <= (2 * row - 1); space++) {
                // printing stars.
                if (space == 1 || row == n || space == (2 * row - 1)) {
                    System.out.print("*");
                }
                // printing spaces.
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }
}
