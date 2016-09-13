import java.util.Scanner;

/**
 * Created by Xiong on 9/13/2016.
 */
public class P19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three edges: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        if (isValid(side1, side2, side3)) {
            System.out.println("The area of the triangle is "
                    + area(side1, side2, side3));
        } else {
            System.out.println("It is not a triangle.");
        }
    }

    public static boolean isValid(double side1,
                                  double side2, double side3) {
        if (((side1 + side2) > side3) && ((side2 + side3) > side1)
                && ((side1 + side3) > side2)) {
            return true;
        } else {
            return false;
        }
    }

    public static double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
