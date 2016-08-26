import java.util.Scanner;

/**
 * Created by xiong on 8/17/16.
 */
public class P5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuity = input.nextDouble();
        gratuity = (int) (subtotal * gratuity / 100 * 100) / 100.0;
        double total = subtotal + gratuity;
        total = (int) (total * 100) / 100.0;
        System.out.println("The gratuity is " + gratuity + " and total is " + total);
    }
}
