import java.util.Scanner;

/*
1 0 1 0 1
0 1 0 1 0
1 0 1 0 1
0 1 0 1 0
1 0 1 0 1 */
public class Pattern_19 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hit a number for print -> ");
        int userIp = sc.nextInt();
        for (int row = 1; row <= userIp; row++) {
            for (int col = 0; col < userIp; col++) {
                System.out.print((row + col) % 2 + " ");
            }
            System.out.println();
        }
    }
}
