import javax.swing.*;

/**
 * Created by xiong on 8/18/16.
 */
public class P10 {
    public static void main(String[] args) {
        int amount;
        String amountString = JOptionPane.showInputDialog(
                "Enter an amount in integer," +
                        " for example 1156 \nfor 11 dollars and 56 cents");
        amount = Integer.parseInt(amountString);
        int remainingAmount = amount;
        int numberOfOneDollar = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        int numberOfPennies = remainingAmount;
        JOptionPane.showMessageDialog(null,
                "Your amount " + amount + " consists of \n"
                        + numberOfOneDollar + "\t dollars\n"
                        + numberOfQuarters + "\t quarters\n"
                        + numberOfDimes + "\t dimes\n"
                        + numberOfNickels + "\t nickels\n"
                        + numberOfPennies + "\t pennies\n");
    }
}
