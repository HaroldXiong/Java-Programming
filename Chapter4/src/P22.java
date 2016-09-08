import java.util.Scanner;

/**
 * Created by Xiong on 9/4/2016.
 */
public class P22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter loan amount: ");
        double loanAmount = input.nextDouble();

        System.out.print("Enter the number of years: ");
        int numberOfYears = input.nextInt();

        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;

        double monthlyPayment = loanAmount * monthlyInterestRate /
                (1 - (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));

        double balance = loanAmount;
        double interest;
        double principal;


        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Number of Years: " + numberOfYears);
        System.out.println("Interest Rate: " + annualInterestRate + "%");
        System.out.println();
        System.out.println("Monthly Payment: " + (int) (monthlyPayment * 100) / 100.0);
        System.out.println("Total Payment: " + (int) (monthlyPayment * 12 * numberOfYears * 100) / 100.0 + "\n");

        System.out.println("Payment#\tInterest\tPrincipal\tBalance");

        for (int i = 1; i <= numberOfYears * 12; i++) {
            interest = (int) (monthlyInterestRate * balance * 100) / 100.0;
            principal = (int) ((monthlyPayment - interest) * 100) / 100.0;
            balance = (int) ((balance - principal) * 100) / 100.0;
            System.out.println(i + "\t\t\t" + interest
                    + "\t\t" + principal + "\t\t" + balance);
        }
    }
}
