import java.util.Scanner;

/**
 * Created by Xiong on 9/12/2016.
 */
public class P6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = input.nextInt();
        displayPattern(n);
    }

    public static void displayPattern(int n) {
        int number = n;
        for (; number >= 0; number--) {
            for (int temp = 0; temp < number; temp++) {
                System.out.print("   ");
            }
            for (int column = n - number; column > 0; column--) {
                System.out.printf("%3d", column);
            }
            System.out.println();
        }
    }
}
