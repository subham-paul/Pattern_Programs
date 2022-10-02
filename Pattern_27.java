/* A B C D E 
A B C D E
A B C D E
A B C D E
A B C D E */
public class Pattern_27 {
    public static void main(String[] args) {
        for (char row = 'A'; row <= 'E'; row++) {
            for (char col = 'A'; col <= 'E'; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
