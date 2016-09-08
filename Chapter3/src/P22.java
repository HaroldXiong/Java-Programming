import java.util.Scanner;

/**
 * Created by xiong on 8/26/16.
 */
public class P22 {
    public static void main(String[] args) {
        System.out.println("Enter a point with two coordinates: ");
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        double distance = Math.sqrt(x * x + y * y);
        if (distance <= 10) {
            System.out.println("Point (" + x + ", " + y
                    + ") is in the circle.");
        } else {
            System.out.println("Point (" + x + ", " + y
                    + ") is not in the circle.");
        }
    }
}
