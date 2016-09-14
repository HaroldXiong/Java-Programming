import java.util.Scanner;

/**
 * Created by Xiong on 9/12/2016.
 */
public class P3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int number = input.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is palindrome.");
        } else {
            System.out.println(number + " is not palindrome.");
        }
    }

    public static int reverse(int number) {
        int result = 0;
        while (number != 0) {
            result = result * 10 + number % 10;
            number = number / 10;
        }
        return result;
    }

    public static boolean isPalindrome(int number) {
        if (number == reverse(number)) {
            return true;
        } else {
            return false;
        }
    }
}
