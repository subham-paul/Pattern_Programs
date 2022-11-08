/* 
0 1 0 1 0 
0 1 0 1 0 
0 1 0 1 0 
0 1 0 1 0
0 1 0 1 0 */
public class Pattern_24 {
    public static void main(String args[]) {
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print((col % 2) + " ");
            }
            System.out.println();
        }
    }
}
