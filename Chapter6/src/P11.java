import java.util.Scanner;

/**
 * Created by xiong on 9/18/16.
 */
public class P11 {
    public static double deviation(double[] x) {
        double squareOfDifferences = 0;

        for (double i :
                x) {
            squareOfDifferences += Math.pow((i - mean(x)), 2);
        }
        return Math.sqrt(squareOfDifferences / (x.length - 1));
    }

    public static double mean(double[] x) {
        double sum = 0;
        for (double i : x) {
            sum += i;
        }
        return sum / x.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] x = new double[10];
        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < x.length; i++) {
            x[i] = input.nextDouble();
        }
        System.out.println("The mean is " + mean(x));
        System.out.println("The standard deviation is "
                + deviation(x));
    }
}
