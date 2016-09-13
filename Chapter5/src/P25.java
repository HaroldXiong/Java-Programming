import java.util.Scanner;

/**
 * Created by Xiong on 9/13/2016.
 */
public class P25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total milliseconds: ");
        long millis = input.nextLong();
        System.out.println(convertMillis(millis));
    }

    public static String convertMillis(long millis) {
        long seconds = 0;
        long minutes = 0;
        long hours = 0;

        long totalSeconds = millis / 1000;
        hours = totalSeconds / 3600;
        long secondsLeft = totalSeconds % 3600;
        minutes = secondsLeft / 60;
        seconds = secondsLeft % 60;
        String secondsInString = String.valueOf(seconds);
        String minutesInString = String.valueOf(minutes);
        String hoursInString = String.valueOf(hours);
        return hoursInString + ":" + minutesInString + ":"
                + secondsInString;
    }
}
