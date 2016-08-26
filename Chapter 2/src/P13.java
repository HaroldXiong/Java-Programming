import javax.swing.*;

/**
 * Created by xiong on 8/18/16.
 */
public class P13 {
    public static void main(String[] args) {
        String amount = JOptionPane.showInputDialog(null,
                "Enter investment amount: ", "P13",
                JOptionPane.QUESTION_MESSAGE);
        String annuallyInterestRate = JOptionPane.showInputDialog(
                null, "Enter annually interest rate: ", "P13",
                JOptionPane.QUESTION_MESSAGE);
        String years = JOptionPane.showInputDialog(null,
                "Enter number of years: ", "P13",
                JOptionPane.QUESTION_MESSAGE);
        double numberOfAmount = Double.parseDouble(amount);
        double numberOfMonthlyInterestRate =
                Double.parseDouble(annuallyInterestRate) / 1200;
        int numberOfYears = Integer.parseInt(years);
        double futureInvestmentValue = numberOfAmount
                * Math.pow((1 + numberOfMonthlyInterestRate),
                numberOfYears * 12);
        JOptionPane.showMessageDialog(null, (int)(futureInvestmentValue*100)/100.0,
                "Accumulated value", JOptionPane.INFORMATION_MESSAGE);
    }
}
