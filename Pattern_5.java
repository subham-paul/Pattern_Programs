/* 5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1 */
public class Pattern_5 {
    public static void main(String args[]){
        for (int row = 5; row >= 1; row--) {
            for (int col = 5; col >= 1; col--) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
