import java.util.Scanner;

/**
 * Created by Xiong on 9/13/2016.
 */
public class P17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = input.nextInt();
        printMatrix(n);
    }

    public static void printMatrix(int n) {
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                System.out.print((int) (Math.random() * 2) + " ");
            }
            System.out.println();
        }
    }
}
