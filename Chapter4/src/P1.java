import java.util.Scanner;

/**
 * Created by xiong on 8/27/16.
 */
public class P1 {
    public static void main(String[] args) {
        System.out.println("Enter an int value, " +
                "the program exits if the input is 0:");
        int numberOfPositives = 0;
        int numberOfNegatives = 0;
        Scanner input = new Scanner(System.in);
        int numberOfInput = input.nextInt();
        int total = numberOfInput;
        double times = 0;

        while (numberOfInput != 0) {
            if (numberOfInput > 0) {
                numberOfPositives++;
            } else {
                numberOfNegatives++;
            }
            numberOfInput = input.nextInt();
            total += numberOfInput;
            times++;
        }
        double average = total / times;

        if (numberOfInput == 0) {
            System.out.println("You didn't enter any number.");
        } else {
            System.out.println("The number of positives is " + numberOfPositives);
            System.out.println("The number of negatives is " + numberOfNegatives);
            System.out.println("The total is " + total);
            System.out.println("The average is " + average);
        }
    }
}
