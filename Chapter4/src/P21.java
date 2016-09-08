import java.util.Scanner;

/**
 * Created by Xiong on 9/2/2016.
 */
public class P21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter loan amount, for example 10000: ");
        double loanAmount = input.nextDouble();

        System.out.println("Enter the number of years, \nfor example 5: ");
        int numberOfYears = input.nextInt();

        System.out.println("Interest Rate"
                + "\t\tMonthly Payment" + "\t\tTotal Payment");

        for (double annualInterestRate = 5.0; annualInterestRate <= 8.0;
             annualInterestRate += 1.0 / 8) {
            double monthlyInterestRate = annualInterestRate / 1200;
            double monthlyPayment = loanAmount * monthlyInterestRate /
                    (1 - (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
            double totalPayment = monthlyPayment * numberOfYears * 12;

            System.out.printf("%5.3f%c%20.2f%22.2f\n", annualInterestRate,
                    '%', monthlyPayment, totalPayment);
        }
    }
}
