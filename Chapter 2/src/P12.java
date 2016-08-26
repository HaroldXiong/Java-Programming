import javax.swing.*;

/**
 * Created by xiong on 8/18/16.
 */
public class P12 {
    public static void main(String[] args) {
        String balance = JOptionPane.showInputDialog(null,
                "Enter balance: ", "P12", JOptionPane.QUESTION_MESSAGE);
        String interestRate = JOptionPane.showInputDialog(null,
                "Enter interest rate(e.g. 3 for 3%): ", "P12",
                JOptionPane.QUESTION_MESSAGE);
        double numberOfBalance = Double.parseDouble(balance);
        double numberOfInterestRate = Double.parseDouble(interestRate);
        double interest = numberOfBalance * (numberOfInterestRate / 1200);
        JOptionPane.showMessageDialog(null, interest);
    }
}
