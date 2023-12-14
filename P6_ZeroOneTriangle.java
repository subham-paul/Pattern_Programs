/* 
1
0 1
1 0 1
0 1 0 1
 */
public class P6_ZeroOneTriangle {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row; col++) {
                if ((row + col) % 2 == 0) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(1 + " ");
                }
            }
            System.out.println();
        }
    }
}
