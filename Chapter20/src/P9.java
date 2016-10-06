import java.util.Scanner;

/**
 * Created by xiong on 10/6/16.
 */
public class P9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string for reversion: ");
        String value = input.nextLine();
        System.out.print("The reversion of " + value + " is ");
        reverseDisplay(value);
    }

    public static void reverseDisplay(String value) {
        if (value.length() > 0) {
            System.out.print(value.charAt(value.length() - 1));
            reverseDisplay(value.substring(0, value.length() - 1));
        }
    }
}
