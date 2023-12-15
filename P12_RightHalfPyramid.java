/* 
Here is the Right Half Pyramid
*   
* * 
* * * 
* * * *
 */
public class P12_RightHalfPyramid {
    public static void printRightHalfPyramid(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Here is the Right Half Pyramid");
        printRightHalfPyramid(n);
    }
}
