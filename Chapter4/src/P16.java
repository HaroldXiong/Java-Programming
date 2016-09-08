import java.util.Scanner;

/**
 * Created by Xiong on 2016/8/31.
 */
public class P16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                System.out.print(i + "\t");
                number /= i;
            }
        }
    }
}
