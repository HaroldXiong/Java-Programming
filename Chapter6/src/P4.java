import java.util.Scanner;

/**
 * Created by xiong on 9/17/16.
 */
public class P4 {
    public static void main(String[] args) {
        double[] scores = new double[10];
        double sum = 0;
        int count = 0;

        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter a new score: ");
            scores[count] = input.nextDouble();
            if (scores[count] >= 0)
                sum += scores[count];
        } while (scores[count++] >= 0);
        System.out.println("count is " + count);
        double average = (sum) / (count - 1);

        int numOfAbove = 0;
        int numOfBelow = 0;
        for (int i = 0; i < count - 1; i++)
            if (scores[i] >= average)
                numOfAbove++;
            else
                numOfBelow++;

        System.out.println("Average is " + average);
        System.out.println("Number of scores above or equal to the average "
                + numOfAbove);
        System.out.println("Number of scores below the average "
                + numOfBelow);
    }
}
