import java.util.Scanner;

/**
 * Created by Xiong on 9/12/2016.
 */
public class P5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        displaySortedNumbers(number1, number2, number3);
    }

    public static void displaySortedNumbers(
            double number1, double number2, double number3) {
        double temp = 0;
        if (number1 > number2) {
            temp = number1;
            number1 = number2;
            number2 = temp;
        }
        if (number2 > number3) {
            temp = number2;
            number2 = number3;
            number3 = temp;
        }
        if (number1 > number2) {
            temp = number1;
            number1 = number2;
            number2 = temp;
        }
        System.out.println(number1 + " < "
                + number2 + " < " + number3);
    }
}
