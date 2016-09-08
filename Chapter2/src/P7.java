import java.util.Scanner;

/**
 * Created by xiong on 8/18/16.
 */
public class P7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of minutes: ");
        int totalMinutes = input.nextInt();
        int days = totalMinutes / 60 / 24 % 365;
        int years = totalMinutes / 60 / 24 / 365;
        System.out.println(totalMinutes + " minutes is approximately "
                + years + " years and " + days + " days.");
    }
}
