/* 
    *
   **
  ***
 ****
***** */

public class Pattern_95 {
    public static void main(String agrs[]){
        int n=5;
        for(int row=1; row<=n; row++){
            for(int col=n-1; col>=row; col--){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
