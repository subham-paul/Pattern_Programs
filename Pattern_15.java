/* 
5 6 15 16 25 
4 7 14 17 24 
3 8 13 18 23 
2 9 12 19 22
1 10 11 20 21 */
public class Pattern_15 {
    public static void main(String args[]) {
        int x, y, n = 5;
        for (int row = 1; row <= n; row++) {
            x = row;
            y = n - row + 1;
            for (int col = 1; col <= n; col++) {
                if (col % 2 == 0) {
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
