/* 
A F K P U 
B G L Q V
C H M R W
D I N S X
E J O T Y */
public class Pattern_32 {
    public static void main(String[] args) {
        int n = 5; int x;
        for (int row = 0; row < n; row++) {
            x = row;
            for (int col = 1; col <= n; col++) {
                x+=n;
                System.out.print((char) (x - n + 65) + " ");
            }
            System.out.println();
        }
    }
}
