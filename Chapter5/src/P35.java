import java.util.Scanner;

/**
 * Created by xiong on 9/14/16.
 */
public class P35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sides of pentagon: ");
        double side = input.nextDouble();
        System.out.println("The area of the pentagon is "
                + areaForPentagon(side));
    }

    public static double areaForPentagon(double side) {
        return 5 * side * side / (4 * Math.tan(Math.PI / 5));
    }
}
