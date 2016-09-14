import java.util.Scanner;

/**
 * Created by Xiong on 9/8/2016.
 */
public class P31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the initial deposit amount: ");
        double initialAmount = input.nextDouble();
        System.out.print("Enter annual percentage yield: ");
        double annualYield = input.nextDouble();
        System.out.print("Enter maturity period (number of month): ");
        double period = input.nextDouble();
        System.out.println();
        double totalAmount = initialAmount;

        System.out.println("Month\t\tCD Value");
        for (int i = 1; i <= period; i++) {
            if (i < 10) {
                System.out.print(i + "\t\t\t");
            } else {
                System.out.print(i + " \t\t\t");
            }
            totalAmount = (int) ((totalAmount + totalAmount * annualYield / 1200) * 100) / 100.0;
            System.out.println(totalAmount);
        }
    }
}
