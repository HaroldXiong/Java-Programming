import java.util.Scanner;

/**
 * Created by Xiong on 2016/8/31.
 */
public class P15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second integer: ");
        int number2 = input.nextInt();

        int d = (number1 > number2) ? number2 : number1;

        for (; d > 0; d--) {
            if (number1 % d == 0 && number2 % d == 0) {
                break;
            }
        }
        System.out.println("GCD of " + number1 + " and "
                + number2 + " is " + d);
    }
}
