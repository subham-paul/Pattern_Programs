/* 
5 
5 4
5 4 3
5 4 3 2
5 4 3 2 1 */

public class Pattern_38 {
    public static void main(String agrs[]) {
        int n = 5;
        for (int row = n; row >= 1; row--) {
            for (int col = n; col >= row; col--) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
