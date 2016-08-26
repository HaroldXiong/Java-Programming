import javax.swing.*;

/**
 * Created by xiong on 8/19/16.
 */
public class P16 {
    public static void main(String[] args) {
        String water = JOptionPane.showInputDialog(null,
                "Enter the amount of water in kilograms: ",
                "P16", JOptionPane.INFORMATION_MESSAGE);
        String initialTemperature = JOptionPane.showInputDialog(
                null, "Enter the initial temperature: ",
                "P16", JOptionPane.INFORMATION_MESSAGE);
        String finalTemperature = JOptionPane.showInputDialog(
                null, "Enter the final temperature: ",
                "P16", JOptionPane.INFORMATION_MESSAGE);
        double waterInKilograms = Double.parseDouble(water);
        double numberOfInitialTemperature =
                Double.parseDouble(initialTemperature);
        double numberOfFinalTemperature =
                Double.parseDouble(finalTemperature);
        double energyNeeded = waterInKilograms *
                (numberOfFinalTemperature -
                        numberOfInitialTemperature) * 4184;
        JOptionPane.showMessageDialog(null, energyNeeded,
                "The energy needed is:",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
