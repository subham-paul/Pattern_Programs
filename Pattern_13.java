/* 
1 10 11 20 21 
2 9 12 19 22 
3 8 13 18 23 
4 7 14 17 24
5 6 15 16 25 */

public class Pattern_13 {
    public static void main(String args[]) {
        int n = 5, x, y;
        for (int row = 1; row <= n; row++) {
            x = row;
            y = n - row + 1;
            for (int col = 1; col <= n; col++) {
                if (col % 2 == 1) {
                    System.out.print(x + " ");
                } else {
                    System.out.print(y + " ");
                }
                x = x + n;
                y = y + n;
            }
            System.out.println();
        }
    }
}
