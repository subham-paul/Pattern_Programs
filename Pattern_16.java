/* 
1 2 3 4 5 
2 3 4 5 6 
3 4 5 6 7 
4 5 6 7 8 
5 6 7 8 9  */
public class Pattern_16 {
    public static void main(String args[]) {
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print(row + col - 1 + " ");
            }
            System.out.println();
        }
    }
}