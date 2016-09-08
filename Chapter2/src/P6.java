import java.util.Scanner;

/**
 * Created by xiong on 8/18/16.
 */
public class P6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        int lastDigit = number % 10;
        int secondLastDigit = (number - lastDigit) % 100 / 10;
        int thirdLastDigit = (number - secondLastDigit - lastDigit)
                % 1000 / 100;
        int sum = lastDigit + secondLastDigit + thirdLastDigit;
        System.out.println("The sum of the digits is " + sum);
    }
}
