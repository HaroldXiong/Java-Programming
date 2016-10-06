import java.util.Scanner;

/**
 * Created by xiong on 10/6/16.
 */
public class P8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer for reversion: ");
        int number = input.nextInt();
        System.out.print("The " + number + "'s reversion is ");
        reverseDisplay(number);
    }

    public static void reverseDisplay(int value) {
        if (value != 0) {
            System.out.print(value % 10);
            value = value / 10;
            reverseDisplay(value);
        }
    }
}
