/* 
1 3 5 7 9 
3 5 7 9 11 
5 7 9 11 13 
7 9 11 13 15 
9 11 13 15 17 */
public class Pattern_17 {
    public static void main(String args[]) {
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print(2 * (row + col) - 3 + " ");
            }
            System.out.println();
        }
    }
}
