import java.util.Scanner;

public class P3_No_increasing_Pyramid {
    public static void main(String args[]) {
        // int n = 5;
        Scanner sc=new Scanner(System.in);
        System.out.print("Print a number -> ");
        int n=sc.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
