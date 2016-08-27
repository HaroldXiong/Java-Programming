import java.util.Scanner;

/**
 * Created by xiong on 8/26/16.
 */
public class P29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter circle1's center x-, y-coordinates, and radius: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double r1 = input.nextDouble();

        System.out.println("Enter circle2's center x-, y-coordinates, and radius: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r2 = input.nextDouble();

        double distance = Math.sqrt((x1 - x2) * (x1 - x2) +
                (y1 - y2) * (y1 - y2));
        if (distance + r2 <= r1) {
            System.out.println("circle2 is inside circle1.");
        } else if (distance <= r1 + r2) {
            System.out.println("circle2 overlaps circle1.");
        } else {
            System.out.println("circle2 deos not overlap circle1.");
        }
    }
}
