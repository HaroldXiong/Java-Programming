import java.util.Scanner;

/**
 * Created by Xiong on 2016/9/1.
 */
public class P17 {
    public static void main(String[] args) {
        System.out.println("Enter an integer from 1 to 15: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number < 1 || number > 15) {
            System.out.println("You entered a wrong integer.");
            System.exit(0);
        }

        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < number - i; j++) {
                System.out.print("   ");
            }
            for (int temp = i; temp > 0; temp--) {
                System.out.print((temp >= 10) ? temp + " " : temp + "  ");
            }

            for (int temp = 2; temp <= i; temp++) {
                System.out.print((temp >= 10) ? temp + " " : temp + "  ");
            }

            System.out.println();
        }
    }
}
