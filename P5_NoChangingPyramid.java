/* 
1 
2 3
4 5 6
7 8 9 10
 */
public class P5_NoChangingPyramid {
    public static void main(String[] args) {
        int n = 4;
        int count = 0;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                ++count;
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }
}
