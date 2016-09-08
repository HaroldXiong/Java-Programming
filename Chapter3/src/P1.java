import java.util.Scanner;

/**
 * Created by xiong on 8/20/16.
 */
public class P1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double r1 = (-b + Math.sqrt(delta)) / (2 * a);
            double r2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        } else if (delta == 0) {
            double r = -b / (2 * a);
            System.out.println("The root is " + r);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}
