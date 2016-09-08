import java.util.Scanner;

/**
 * Created by xiong on 8/17/16.
 */
public class P2 {
    public static void main(String[] args) {
        final double PI = 3.1415926;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius and length of a cylinder:");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double area = radius * radius * PI;
        double volume = area * length;
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}
