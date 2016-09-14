/**
 * Created by Xiong on 9/13/2016.
 */
public class P21 {
    public static void main(String[] args) {
        final int COUNT = 10;
        double sum = 0;
        double squareSum = 0;

        java.util.Scanner input = new java.util.Scanner(System.in);

        for (int i = 0; i < COUNT; i++) {
            System.out.print("Enter a number: ");
            double number = input.nextDouble();
            sum += number;
            squareSum += Math.pow(number, 2);
        }

        double mean = sum / COUNT;
        double deviation =
                Math.sqrt((squareSum - sum * sum / COUNT) / (COUNT - 1));

        System.out.println("The mean is " + mean);
        System.out.println("The standard deviation is " + deviation);

    }
}
