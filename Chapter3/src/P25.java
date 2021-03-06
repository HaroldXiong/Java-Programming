import java.util.Scanner;

/**
 * Created by xiong on 8/26/16.
 */
public class P25 {
    public static void main(String[] args) {
        System.out.println("Enter three edges: ");
        Scanner input = new Scanner(System.in);
        double e1 = input.nextDouble();
        double e2 = input.nextDouble();
        double e3 = input.nextDouble();

        boolean isATriangle = (e1 + e2 > e3
                && e1 + e3 > e2 && e2 + e3 > e1);
        if (isATriangle) {
            System.out.println("The circumference of the triangle is "
                    + (e1 + e2 + e3) + ".");
        } else {
            System.out.println("It is not a triangle!");
        }
    }
}
