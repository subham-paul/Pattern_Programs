/* 
A B C D E 
B C D E F
C D E F G
D E F G H
E F G H I */
public class Pattern_31 {
    public static void main(String args[]) {
        int n = 5;
        for (char row = 0; row < n; row++) {
            for (char col = 0; col < n; col++) {
                System.out.print((char)(row+col+65));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}