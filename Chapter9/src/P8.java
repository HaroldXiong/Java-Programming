import java.util.Scanner;

/**
 * Created by xiong on 9/29/16.
 */
public class P8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number string: ");
        String s = input.nextLine();
        System.out.println("The decimal value is " + binaryToDecimal(s));

    }

    public static int binaryToDecimal(String binaryString) {
        int value = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            value = value * 2 + binaryString.charAt(i) - '0';
        }
        return value;
    }
}
