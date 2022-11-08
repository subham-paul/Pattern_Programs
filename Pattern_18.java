import java.util.Scanner;

/* 
0 1 0 1 0
1 0 1 0 1
0 1 0 1 0
1 0 1 0 1
0 1 0 1 0 */

public class Pattern_18 {
    public static void main(String args[]) {
        try (Scanner subham = new Scanner(System.in)) {
            System.out.print("Enter a range for print pattern-> ");
            int n = subham.nextInt();
            // int n = 5;
            for (int row = 1; row <= n; row++) {
                for (int col = 1; col <= n; col++) {
                    System.out.print((row + col) % 2 + " ");
                }
                System.out.println();
            }
        }
    }
}
