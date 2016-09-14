import java.util.Scanner;

/**
 * Created by Xiong on 9/13/2016.
 */
public class P22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        double number = input.nextDouble();
        System.out.println(
                "The square root for " + number + " is " + sqrt(number));
    }

    public static double sqrt(double num) {
        double nextGuess = 1.0;
        double lastGuess;

        do {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + (num / lastGuess)) * 0.5;
        } while (Math.abs(nextGuess - lastGuess) >= 0.00001);

        return nextGuess;
    }
}
