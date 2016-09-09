import java.util.Scanner;

/**
 * Created by Xiong on 9/9/2016.
 */
public class P43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of second: ");
        int numberOfSeconds = input.nextInt();

        long startTime = System.currentTimeMillis() / 1000;
        long endTime = startTime + numberOfSeconds;

        while (System.currentTimeMillis() / 1000 < endTime) {
            while (startTime != System.currentTimeMillis() / 1000) {
                startTime += 1;
                if (endTime - startTime > 1) {
                    System.out.println(endTime - startTime + " seconds remaining.");
                } else if (endTime - startTime == 1) {
                    System.out.println("1 second remaining.");
                }
            }
        }
        System.out.println("Stopped");
    }
}
