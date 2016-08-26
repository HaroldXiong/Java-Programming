import javax.swing.*;

/**
 * Created by xiong on 8/18/16.
 */
public class P11 {
    public static void main(String[] args) {
        String nameOfEmployee = JOptionPane.showInputDialog(
                null, "Enter the employee's name: ",
                "P11", JOptionPane.QUESTION_MESSAGE);
        String workHoursInaWeek = JOptionPane.showInputDialog(
                null, "Enter number of hours worked in a week: ",
                "P11", JOptionPane.QUESTION_MESSAGE);
        String payRateHourly = JOptionPane.showInputDialog(null,
                "Enter hourly pay rate: ", "P11",
                JOptionPane.QUESTION_MESSAGE);
        String federalTaxRate = JOptionPane.showInputDialog(null,
                "Enter federal tax withholding rate", "P11",
                JOptionPane.QUESTION_MESSAGE);
        String stateTaxRate = JOptionPane.showInputDialog(null,
                "Enter state tax withholding rate", "P11",
                JOptionPane.QUESTION_MESSAGE);
        double workHours = Double.parseDouble(workHoursInaWeek);
        double payRate = Double.parseDouble(payRateHourly);
        double federalTax = Double.parseDouble(federalTaxRate);
        double stateTax = Double.parseDouble(stateTaxRate);
        double grossPay = workHours * payRate;
        System.out.println("Employee Name: " + nameOfEmployee);
        System.out.println("Hours Worked: " + workHours);
        System.out.println("Pay Rate:   $" + payRate);
        System.out.println("Gross Pay:   $" + grossPay);
        System.out.println("Deductions: ");
        System.out.println("  Federal Withholding ("
                + federalTax * 100.0 + "%):   $"
                + grossPay * federalTax);
        System.out.println("  State Withholding ("
                + stateTax * 100.0 + "%):   $" + grossPay * stateTax);
        System.out.println("  Total Deduction:   $" + grossPay
                * (federalTax + stateTax));
        System.out.println("New Pay:   $"
                + grossPay * (1 - federalTax - stateTax));
    }
}
