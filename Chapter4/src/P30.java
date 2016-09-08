import java.util.Scanner;

/**
 * Created by Xiong on 9/6/2016.
 */
public class P30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the money: ");
        double accountOfStart = input.nextDouble();
        System.out.println("Enter the annual interest:" +
                " for example 5 for 5%");
        double annualInterest = input.nextDouble();
        System.out.println("Enter the number of months: ");
        int months = input.nextInt();
        double monthlyInterest = annualInterest / 1200;

        double totalAccount = 0;
        for (int i = 1; i <= months; i++) {
            totalAccount = (int) ((accountOfStart + totalAccount)
                    * (1 + monthlyInterest) * 100) / 100.0;
        }
        System.out.println("After " + months
                + " months, total account is " + totalAccount);
    }
}
