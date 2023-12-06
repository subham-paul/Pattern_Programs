/* 
5 
4 4
3 3 3
2 2 2 2
1 1 1 1 1
 */

public class Pattern_37 {
    public static void main(String agrs[]) {
        int n = 5;
        for (int row = n; row >= 1; row--) {
            for (int col = n; col >= row; col--) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
