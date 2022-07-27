/* 
0 1 0 1 0 
0 0 0 0 0
0 1 0 1 0
0 0 0 0 0 */
public class Pattern_21 {
    public static void main(String args[]) {
        int n = 5;
        for (int row = 1; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print((row * col) % 2 + " ");
            }
            System.out.println();
        }
    }
}
