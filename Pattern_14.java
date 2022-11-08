/* 
5 10 15 20 25 
4 9 14 19 24
3 8 13 18 23
2 7 12 17 22
1 6 11 16 21 */
public class Pattern_14 {
    public static void main(String args[]) {
        int x, n = 5;
        for (int row = 1; row<=n; row++){
            x = n - row + 1;
            for (int col = 1; col <= n; col++) {
                System.out.print(x + " ");
                x = x+ n;
            }
            System.out.println();
        }
    }
}