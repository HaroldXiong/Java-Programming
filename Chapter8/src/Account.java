import java.util.Date;

/**
 * Created by xiong on 9/28/16.
 */public class Account {
    private int idOfAccount;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreate;

    Account() {
    }

    public int getIdOfAccount() {
        return idOfAccount;
    }

    public void setIdOfAccount(int newId) {
        idOfAccount = newId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public static double getAnnualInterest() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(
            double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreate;
    }

    Account(int newId, double newBalance) {
        setIdOfAccount(newId);
        setBalance(newBalance);
    }

    double getMonthlyInterestRate() {
        return getAnnualInterest() / 12;
    }

    double withdraw(double numberOfWithdraw) {
        setBalance(getBalance() - numberOfWithdraw);
        return balance;
    }

    double deposit(double numberOfDeposit) {
        setBalance(getBalance() + numberOfDeposit);
        return balance;
    }
}
