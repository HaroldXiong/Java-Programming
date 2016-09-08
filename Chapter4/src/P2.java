import java.util.Scanner;

/**
 * Created by Xiong on 2016/8/29.
 */
public class P2 {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 10;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = new String();
        Scanner input = new Scanner(System.in);

        while (count <= NUMBER_OF_QUESTIONS) {
            int number1 = (int) (Math.random() * 15) + 1;
            int number2 = (int) (Math.random() * 15) + 1;

            System.out.println("What is " + number1 + "+ "
                    + number2 + " ?");
            int answer = input.nextInt();

            if (answer == number1 + number2) {
                System.out.println("You are correct!");
                correctCount++;
            } else {
                System.out.println("Your answer is wrong!\n"
                        + number1 + " + " + number2
                        + " should be " + (number1 + number2));
            }
            count++;
            output += "\n" + number1 + "+" + number2 + "=" + answer
                    + ((number1 + number2 == answer) ? "correct" : "wrong");
        }
        long endTime = System.currentTimeMillis();
        long time = (endTime - startTime) / 1000;

        System.out.println("Correct count is " + correctCount + "\n " +
                "Test time is " + time + " seconds\n" + output);
    }
}
