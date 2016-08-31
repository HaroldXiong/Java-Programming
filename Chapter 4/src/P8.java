import java.util.Scanner;

/**
 * Created by Xiong on 2016/8/30.
 */
public class P8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "";
        String nameOfTheHighest = "";
        double scoreOfTheHighest = 0;

        System.out.println("Enter the number of students:");
        final int NUMBER_OF_STUDENT = input.nextInt();

        for (int i = 0; i < NUMBER_OF_STUDENT; i++) {
            System.out.println("Enter the student's name:");
            name = input.next();
            System.out.println("Enter the student's score: ");
            double scoreInLoop = input.nextDouble();
            if (scoreInLoop >= scoreOfTheHighest) {
                nameOfTheHighest = name;
                scoreOfTheHighest = scoreInLoop;
            }
        }
        System.out.println(nameOfTheHighest + " get the highest score: " + scoreOfTheHighest);
    }
}
