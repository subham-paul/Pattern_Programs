/* 
*****
 ****
  ***
   **
    *
 */
public class P15_ReverseLeftHalfPyramid {
    public static void printPattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col < row; col++) {
                System.out.print(" ");
            }
            for (int col = n; col >= row; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        /*
         * Scanner sc = new Scanner(System.in);
         * System.out.print("Enter a number -> ");
         * int n = sc.nextInt();
         */
        int n = 5;
        printPattern(n);
    }
}
