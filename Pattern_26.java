/* A A A A A 
B B B B B 
C C C C C
D D D D D
E E E E E */
public class Pattern_26 {
    public static void main(String args[]) {
        for (char row = 'A'; row <= 'E'; row++) {
            for (char col = 'A'; col <= 'E'; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
