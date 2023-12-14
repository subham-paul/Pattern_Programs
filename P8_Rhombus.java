/* 
Here is the Rhombus
 * * * * * 
  * * * * * 
   * * * * * 
    * * * * * 
     * * * * * 
 */
public class P8_Rhombus {
    public static void printRhombus(int n) {
        for (int row = 1; row <= n; row++) {
            for (int s = 1; s <= row; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Here is the Rhombus");
        printRhombus(n);
    }
}
