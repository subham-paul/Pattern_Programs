
/* 
Enter number here -> 5
*
* *
* * *
* * * *
* * * * *
 */
import java.util.Scanner;

public class Pattern_34 {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number here -> ");
        n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
