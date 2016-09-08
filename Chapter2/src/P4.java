import java.util.Scanner;

/**
 * Created by xiong on 8/17/16.
 */
public class P4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number in pounds: ");
        double pounds = input.nextDouble();
        double kilograms = pounds * 0.454;
        System.out.println(pounds + " pounds is "
                + kilograms + " kilograms");
    }
}
