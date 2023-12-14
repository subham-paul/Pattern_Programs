/* 
Enter a number -> 5
        1 
      2 1 2 
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
 */
import java.util.Scanner;

public class P7_PalindromeTriangle {
    public static void printPattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= 2 * (n - row); col++) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        // int n=6;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number -> ");
        int n = sc.nextInt();
        printPattern(n);
    }
}
