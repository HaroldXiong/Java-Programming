import javax.swing.*;

/**
 * Created by xiong on 8/26/16.
 */
public class P18 {
    public static void main(String[] args) {
        String year = JOptionPane.showInputDialog(null, "Enter a year: ",
                "P18", JOptionPane.INFORMATION_MESSAGE);
        int numberOfYear = Integer.parseInt(year);
        boolean isLeapYear = (numberOfYear % 4 == 0
                && numberOfYear % 100 != 0) || (numberOfYear % 400 == 0);
        JOptionPane.showMessageDialog(null, year + " is a leap year?   "
                + isLeapYear, "P18", JOptionPane.INFORMATION_MESSAGE);
    }
}
