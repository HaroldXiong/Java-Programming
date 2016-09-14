/**
 * Created by Xiong on 9/12/2016.
 */
public class P8 {
    public static void main(String[] args) {
        System.out.println("Celsius\tFahrenheit\tFahrenheit\tCelsius");
        double j = 120.0;
        for (double i = 40.0; i > 30.0; i--) {
            System.out.printf("%-7.1f\t%-10.1f\t%-10.1f\t%-7.2f", i,
                    celsiusToFahrenheit(i), j, fahrenheitToCelsius(j));
            System.out.println();
            j -= 10;
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / (9.0 / 5);
    }
}
