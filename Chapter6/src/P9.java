import java.util.Scanner;

/**
 * Created by xiong on 9/18/16.
 */
public class P9 {
    public static double min(double[] array) {
        double min = array[0];
        for (double n :
                array) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] array = new double[10];
        System.out.println("Enter ten number: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }
        System.out.println("The minimum number is: " + min(array));
    }
}
