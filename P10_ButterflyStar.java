/* 
Here is the Butterfly Star Pattern
*             * 
* *         * *
* * *     * * *
* * * * * * * *
* * * * * * * *
* * *     * * *
* *         * *
*             *
 */
public class P10_ButterflyStar {

    public static void printButterflyStar(int n) {
        int i, j;
        // outer loop to handle upper part
        for (i = 1; i <= n; i++) {
            // inner loop to print stars
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // inner loop to print spaces
            int spaces = 2 * (n - i);
            for (j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            // inner loop to print stars
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // outer loop to handle lower part
        for (i = n; i >= 1; i--) {
            // inner loop to print stars
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // inner loop to print spaces
            int spaces = 2 * (n - i);
            for (j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            // inner loop to print stars
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 4;
        System.out.println("Here is the Butterfly Star Pattern");
        printButterflyStar(n);
    }
}
