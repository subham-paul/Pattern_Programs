
/* 
Enter a number -> 5
1 0 1 0 1 
1 0 1 0 1
1 0 1 0 1
1 0 1 0 1
1 0 1 0 1 */
import java.util.Scanner;

public class Pattern_25 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number -> ");
            int n = sc.nextInt();
            // int n = 5;
            for (int row = 0; row < n; row++) {
                for (int col = 1; col <= n; col++) {
                    System.out.print((col % 2) + " ");
                }
                System.out.println();
            }
        }
    }
}
