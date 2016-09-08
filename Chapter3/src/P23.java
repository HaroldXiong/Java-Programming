import java.util.Scanner;

/**
 * Created by xiong on 8/26/16.
 */
public class P23 {
    public static void main(String[] args) {
        System.out.println("Enter a point with two coordinates: ");
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        if (x <= 10 / 2 && x >= -10 / 2 && y <= 5 / 2.0
                && y >= -5 / 2.0) {
            System.out.println("Point (" + x + ", " + y
                    + ") is in the circle.");
        } else {
            System.out.println("Point (" + x + ", " + y
                    + ") is not in the circle.");
        }
    }
}
