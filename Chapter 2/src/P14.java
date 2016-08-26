import javax.swing.*;

/**
 * Created by xiong on 8/18/16.
 */
public class P14 {
    public static void main(String[] args) {
        String weight = JOptionPane.showInputDialog(null,
                "Enter weight in pounds: ", "P14",
                JOptionPane.INFORMATION_MESSAGE);
        String height = JOptionPane.showInputDialog(null,
                "Enter height in inches: ", "P14",
                JOptionPane.INFORMATION_MESSAGE);
        double numberOfWeightInPounds =
                Double.parseDouble(weight);
        double numberOfWeightInKilograms =
                numberOfWeightInPounds * 0.45359237;
        double numberOfHeightInInches =
                Double.parseDouble(height);
        double numberOfHeightInMeters =
                numberOfHeightInInches * 0.0254;
        double Bmi = numberOfWeightInKilograms /
                Math.pow(numberOfHeightInMeters, 2);
        JOptionPane.showMessageDialog(null, Bmi,
                "BMI is :", JOptionPane.INFORMATION_MESSAGE);
    }
}
