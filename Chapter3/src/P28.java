import java.util.Map;
import java.util.Scanner;

/**
 * Created by xiong on 8/26/16.
 */
public class P28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter r1's center x-, y-coordinates, width and height: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double w1 = input.nextDouble();
        double h1 = input.nextDouble();
        System.out.println("Enter r2's center x-, y-coordinates, width and height: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double w2 = input.nextDouble();
        double h2 = input.nextDouble();

        double distanceOfX = Math.abs(x2 - x1);
        double distanceOfY = Math.abs(y2 - y1);

        if (distanceOfX <= (w1 - w2) && (distanceOfY <= (h1 - h2))) {
            System.out.println("r2 is inside r1.");
        } else if (distanceOfX <= (w1 + w2) / 2
                && distanceOfY <= (h1 + h2) / 2) {
            System.out.println("r2 overlaps r1");
        } else {
            System.out.println("r2 does not overlap r1");
        }
    }
}
