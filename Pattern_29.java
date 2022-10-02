/* E D C B A 
E D C B A
E D C B A
E D C B A
E D C B A */
public class Pattern_29 {
    public static void main(String args[]) {
        for (char row = 'E'; row >= 'A'; row--) {
            for (char col = 'E'; col >= 'A'; col--) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
