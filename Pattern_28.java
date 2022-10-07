/* 
E E E E E 
D D D D D
C C C C C
B B B B B
A A A A A */
public class Pattern_28 {
    public static void main(String[] args){
        for(char row = 'E'; row>='A'; row--){
            for(char col = 'E'; col>='A'; col--){
                System.out.print(row + " ");
                // break;
            }
            System.out.println();
        }
    }
}
