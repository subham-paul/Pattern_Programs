/* 
Here is the SquareFill pattern
* * * * * 
* * * * *
* * * * *
* * * * *
* * * * *
 */
public class P11_SquareFill {
    public static void printSquareFill(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Here is the SquareFill pattern");
        printSquareFill(n);
    }
}
