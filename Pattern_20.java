
/* 
1 0 1 0 1 
0 0 0 0 0
1 0 1 0 1
0 0 0 0 0 
1 0 1 0 1 */
import java.util.Scanner;

public class Pattern_20 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Hit a number for print -> ");
            int userIp = sc.nextInt();
            for (int row = 1; row <= userIp; row++) {
                for (int col = 1; col <= userIp; col++) {
                    System.out.print((row * col) % 2 + " ");
                }
                System.out.println();
            }
        }
    }
}
