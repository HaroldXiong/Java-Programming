import java.util.Scanner;

/**
 * Created by Xiong on 9/12/2016.
 */
public class P4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        reverse(number);
    }

    public static void reverse(int number) {
        int result = 0;
        while (number != 0) {
            result = result * 10 + number % 10;
            number = number / 10;
        }
        System.out.println(result);
    }
}
