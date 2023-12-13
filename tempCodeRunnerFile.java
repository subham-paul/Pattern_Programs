public class P2_NumberTriangular {
    public static void main(String args[]) {
        int n = 5;
        for (int row = 1; row < n; row++) {
            for (int col = 0; col < row; col++) {
                for (int space = n - 1; space > 0; space--) {
                    System.out.print(" ");
                }
                System.out.print(row);
            }
            System.out.println();
        }
    }
}
