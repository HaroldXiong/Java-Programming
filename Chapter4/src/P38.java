import java.util.Scanner;

/**
 * Created by Xiong on 9/9/2016.
 */
public class P38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer(decimal): ");
        int decimal = input.nextInt();

        String hexString = "";
        int value = decimal;
        while (value != 0) {
            int single = value % 16;

            if (single == 15)
                hexString = "F" + hexString;
            else if (single == 14)
                hexString = "E" + hexString;
            else if (single == 13)
                hexString = "D" + hexString;
            else if (single == 12)
                hexString = "C" + hexString;
            else if (single == 11)
                hexString = "B" + hexString;
            else if (single == 10)
                hexString = "A" + hexString;
            else
                hexString = single + hexString;

            value = value / 16;
        }

        System.out.println(decimal + "'s hex representation is "
                + hexString);
    }
}
