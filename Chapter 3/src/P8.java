import java.util.Scanner;

/**
 * Created by xiong on 8/23/16.
 */
public class P8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integers: ");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        System.out.println("You entered three integers, they are:  "
                + x + "\t" + y + "\t" + z);
        if (y > z) {
            int temp = y;
            y = z;
            z = temp;
        }
        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }
        if (y > z) {
            int temp = y;
            y = z;
            z = temp;
        }
        System.out.println("After sorting:(num1 <= num2 <= num3) "
                + x + "\t" + y + "\t" + z);
    }
}
