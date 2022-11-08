/* 
1 6 11 16 21 
2 7 12 17 22 
3 8 13 18 23 
4 9 14 19 24 
5 10 15 20 25 */

public class Pattern_12 {
    public static void main(String args[]) {
        int n = 5, temp;
        for (int row = 1; row <= 5; row++) {
            temp = row;
            for (int col = 1; col <= 5; col++) {
                System.out.print(temp + " ");
                temp += n;
            }
            System.out.println();
        }
    }
}
