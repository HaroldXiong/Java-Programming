import javax.swing.*;

/**
 * Created by xiong on 8/26/16.
 */
public class P20 {
    public static void main(String[] args) {
        String temperatureInFahrenheit = JOptionPane.showInputDialog(
                null, "Enter the temperature in Fahrenheit: ",
                "P17", JOptionPane.INFORMATION_MESSAGE);
        String windSpeed = JOptionPane.showInputDialog(
                null, "Enter the wind speed miles per hour: ",
                "P17", JOptionPane.INFORMATION_MESSAGE);
        double numberOfTa =
                Double.parseDouble(temperatureInFahrenheit);
        double numberOfWindSpeed = Double.parseDouble(windSpeed);
        double numberOfTwc = 35.74 + 0.6215 * numberOfTa - 35.75 *
                Math.pow(numberOfWindSpeed, 0.16) + 0.4275 *
                numberOfTa * Math.pow(numberOfWindSpeed, 0.16);
        if (numberOfTa >= -58 && numberOfTa <= 41 && numberOfWindSpeed >= 2) {
            JOptionPane.showMessageDialog(null, numberOfTwc,
                    "The wind chill index is: ",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "You have entered wrong number!",
                    "P20", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
