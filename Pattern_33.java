
/* Please Enter a Number-> 5
E J O T Y 
D I N S X 
C H M R W 
B G L Q V 
A F K P U  */
import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

public class Pattern_33 {
    public static void main(String args[]) {
        int n, x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Number-> ");
        n = sc.nextInt();
        if (n <= 5) {
            for (int loop = 1; loop <= n; loop++) {
                x = n - loop;
                for (int iLoop = 1; iLoop <= n; iLoop++) {
                    System.out.print((char) (x + 65) + " ");
                    x = x + n;
                }
                System.out.println();
            }
        } else {
            System.out.println("Please enter less than 6 number");
        }
    }
}
