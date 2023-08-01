
/* Print a number -> 5
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5 */
import java.util.Scanner;

public class Pattern_36 {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Print a number -> ");
        n = sc.nextInt();
        for (int row = 1; row <= n; ++row) {
            for (int col = 1; col <= row; ++col) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
