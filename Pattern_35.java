
/* Enter a number here -> 5
1 
2 2
3 3 3
4 4 4 4
5 5 5 5 5 */
import java.util.Scanner;

public class Pattern_35 {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number here -> ");
        n = sc.nextInt();
        for (int row = 1; row <= n; ++row) {
            for (int col = 1; col <= row; ++col) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
