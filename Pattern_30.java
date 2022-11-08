/* 
A B C D E 
F G H I J 
K L M N O 
P Q R S T 
U V W X Y */
public class Pattern_30 {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(ch + " ");
                if (ch < 'Z') {
                    ch++;
                } else {
                    ch = (char) 'A';
                }
            }
            System.out.println();
        }
    }
}
