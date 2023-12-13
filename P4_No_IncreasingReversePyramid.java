
/* 
1 2 3 4 5 
1 2 3 4
1 2 3
1 2
1
 */
import java.util.Scanner;

public class P4_No_IncreasingReversePyramid {
    public static void main(String args[]) {
        int n = 5;
        // Scanner sc = new Scanner(System.in);
        // System.out.print("ENTER A NUMBER -> ");
        // int n = sc.nextInt();
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
