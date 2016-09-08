import java.util.Scanner;

/**
 * Created by Xiong on 2016/8/30.
 */
public class P9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "";
        String nameOfTheHighest = "";
        String nameOfTheSecondHighest = "";
        double scoreOfTheHighest = 0;
        double scoreOfTheSecondHighest = 0;

        System.out.println("Enter the number of students:");
        final int NUMBER_OF_STUDENT = input.nextInt();

        for (int i = 0; i < NUMBER_OF_STUDENT; i++) {
            System.out.println("Enter the student's name:");
            name = input.next();
            System.out.println("Enter the student's score: ");
            double scoreInLoop = input.nextDouble();
            if (scoreInLoop >= scoreOfTheSecondHighest) {
                nameOfTheSecondHighest = name;
                scoreOfTheSecondHighest = scoreInLoop;
                if (scoreInLoop >= scoreOfTheHighest) {
                    double temp = scoreOfTheHighest;
                    scoreOfTheHighest = scoreInLoop;
                    scoreOfTheSecondHighest = temp;
                    String tempOfName = nameOfTheHighest;
                    nameOfTheHighest = name;
                    nameOfTheSecondHighest = tempOfName;
                }
            }
        }
        System.out.println(nameOfTheHighest
                + " get the highest score: " + scoreOfTheHighest);
        System.out.println(nameOfTheSecondHighest
                + " get the second highest score: " + scoreOfTheSecondHighest);
    }
}
