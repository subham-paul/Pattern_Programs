/* 
Here is the K Pattern output 
* * * * * 
* * * *
* * *
* *
*
* *
* * *
* * * *
* * * * *
 */
public class P16_K_Pattern {
    public static void printPattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 2; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        /*
         * Scanner sc = new Scanner(System.in);
         * System.out.print("Enter the Magical number-> ");
         * int n = sc.nextInt();
         */
        System.out.println("Here is the K Pattern output ");
        int n = 5;
        printPattern(n);
    }
}
