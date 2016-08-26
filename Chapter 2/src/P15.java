/**
 * Created by xiong on 8/19/16.
 */
public class P15 {
    public static void main(String[] args) {
        double account = 100;
        double annuallyInterestRate = 0.05;
        double monthlyInterestRate = annuallyInterestRate / 12;
        double firstMonthAccount = account
                * (1 + monthlyInterestRate);
        double secondMonthAccount = (account + firstMonthAccount)
                * (1 + monthlyInterestRate);
        double thirdMonthAccount = (account + secondMonthAccount)
                * (1 + monthlyInterestRate);
        double forthMonthAccount = (account + thirdMonthAccount)
                * (1 + monthlyInterestRate);
        double fifthMonthAccount = (account + forthMonthAccount)
                * (1 + monthlyInterestRate);
        double sixthMonthAccount = (account + fifthMonthAccount)
                * (1 + monthlyInterestRate);
        System.out.println(sixthMonthAccount);
    }
}
