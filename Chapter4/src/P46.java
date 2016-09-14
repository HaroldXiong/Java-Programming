import java.util.Scanner;

/**
 * Created by Xiong on 9/9/2016.
 */
public class P46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        short number = input.nextShort();

        System.out.print("The 16 bits are ");
        int mask = 1;
        for (int i = 15; i >= 0; i--) {
            int temp = number >> i;
            int bit = temp & mask;
            System.out.print(bit);
        }
    }
}
