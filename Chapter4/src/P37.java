import java.util.Scanner;

/**
 * Created by Xiong on 9/9/2016.
 */
public class P37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer(decimal): ");
        int decimal = input.nextInt();

        String binary = "";
        int value = decimal;
        while (value != 0) {
            binary = value % 2 + binary;
            value = value / 2;
        }

        System.out.println(decimal + "'s binary representation is "
                + binary);
    }
}
