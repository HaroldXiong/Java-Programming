import java.util.Scanner;

/**
 * Created by xiong on 9/17/16.
 */
public class P1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int number = input.nextInt();
        System.out.println("Enter " + number + " scores: ");
        double[] scores = new double[number];
        double best = 0;
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextDouble();
            if (scores[i] > best) {
                best = scores[i];
            }
        }

        for (int i = 0; i < scores.length; i++) {
            char grade = grade(scores[i], best);
            System.out.println("Student " + i + " score is "
                    + scores[i] + " and grade is " + grade);
        }
    }

    public static char grade(double score, double best) {
        if (score >= best - 10) {
            return 'A';
        } else if (score >= best - 20) {
            return 'B';
        } else if (score >= best - 30) {
            return 'C';
        } else if (score >= best - 40) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
