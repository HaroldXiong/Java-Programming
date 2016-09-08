import java.util.Scanner;

/**
 * Created by xiong on 8/21/16.
 */
public class P3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c, d, e, f: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        int f = input.nextInt();

        if (a * d - b * c == 0) {
            System.out.println("The equation has no solution.");
        } else {
            int x = (e * d - b * f) / (a * d - b * c);
            int y = (a * f - e * c) / (a * d - b * c);
            System.out.println("x is " + x + " and y is " + y);
        }
    }
}
