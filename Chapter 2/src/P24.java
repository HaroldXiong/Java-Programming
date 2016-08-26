import java.util.Scanner;

/**
 * Created by xiong on 8/19/16.
 */
public class P24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter v and a: ");
        double v = input.nextDouble();
        double a = input.nextDouble();
        double length = v * v / (2 * a);
        System.out.println("The minimum runway"
                + " length for this airplane is "
                + length);
    }
}
