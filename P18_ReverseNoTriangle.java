/* 
1 2 3 4 5 
 2 3 4 5 
  3 4 5 
   4 5
    5
 */
public class P18_ReverseNoTriangle {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col < row; col++) {
                System.out.print(" ");
            }
            for (int col = row; col <= n; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
