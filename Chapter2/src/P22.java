import java.util.Scanner;

/**
 * Created by xiong on 8/19/16.
 */
public class P22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side:");
        double side = input.nextDouble();
        double area = 3 * Math.sqrt(3) / 2 * side * side;
        System.out.println("The area of the hexagon is"
                + area);
    }
}
