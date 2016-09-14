import java.util.Scanner;

/**
 * Created by Xiong on 9/12/2016.
 */
public class P7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount invested: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter the annual interest rate: " +
                "for example 9 for 9%  ");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate / 12;
        System.out.println();
        System.out.println("The amount invested: "
                + investmentAmount);
        System.out.println("Annual interest rate: "
                + annualInterestRate + "%");
        System.out.println("Years\t\t\tFuture Value");
        for (int years = 1; years <= 30; years++) {
            System.out.printf("%5d", years);
            System.out.println("\t\t\t"
                    + futureInvestmentValue(investmentAmount,
                    monthlyInterestRate, years));
        }

    }

    public static double futureInvestmentValue(
            double investmentAmount,
            double monthlyInterestRate, int years) {
        return (int) (investmentAmount
                * Math.pow((1 + monthlyInterestRate / 100),
                years * 12) * 100) / 100.0;
    }
}
