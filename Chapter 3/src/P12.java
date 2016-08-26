import java.util.Scanner;

/**
 * Created by xiong on 8/25/16.
 */
public class P12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer for testing " +
                "if it can be divided exactly by 5 and 6.");
        int number = input.nextInt();
        if (number % 5 == 0 && number % 6 == 0) {
            System.out.println(number + " is divisible by both 5 and 6.");
        } else if (number % 5 == 0 || number % 6 == 0) {
            System.out.println(number + " is divisible by 5 or 6, but not both.");
        } else {
            System.out.println(number + " is not divisible by either 5 or 6.");
        }
    }
}
