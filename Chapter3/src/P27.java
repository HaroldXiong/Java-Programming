import java.util.Scanner;

/**
 * Created by xiong on 8/26/16.
 */
public class P27 {
    public static void main(String[] args) {
        System.out.println("Enter a point's x- and y-coordinates: ");
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();

        if (x <= 200 && x >= 0 && y >= 0 && y <= -x / 2.0 + 100) {
            System.out.println("The point is in the triangle");
        } else {
            System.out.println("The point is not in the triangle");
        }
    }
}
