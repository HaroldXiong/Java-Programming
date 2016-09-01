/**
 * Created by Xiong on 2016/9/1.
 */
public class P19 {
    public static void main(String[] args) {
        for (int row = 1; row <= 8; row++) {
            for (int column = 8 - row; column > 0; column--) {
                System.out.print("    ");
            }
            for (int exponent = 0; exponent < row; exponent++) {
                int number = (int) Math.pow(2, exponent);
                String space = new String();
                if (number >= 100) {
                    space = " ";
                } else if (number >= 10) {
                    space = "  ";
                } else {
                    space = "   ";
                }
                System.out.print(space + number);
            }
            for (int exponent = row - 2; exponent >= 0; exponent--) {
                int number = (int) Math.pow(2, exponent);
                String space = new String();
                if (number >= 100) {
                    space = " ";
                } else if (number >= 10) {
                    space = "  ";
                } else {
                    space = "   ";
                }
                System.out.print(space + number);
            }
            System.out.println();
        }
    }
}
