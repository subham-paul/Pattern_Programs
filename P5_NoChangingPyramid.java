

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
