/* 
    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 
 */
public class P2_NumberTriangular {
    public static void main(String args[]) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
