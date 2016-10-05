import java.util.Scanner;

/**
 * Created by xiong on 10/5/16.
 */
public class P2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the sequence: ");
        int n = input.nextInt();
        System.out.println(fib(n));
    }

    public static int fib(int n) {
        int f0 = 0;
        int f1 = 1;
        int currentFib = 0;

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        for (int i = 0; i <= n; i++) {
            currentFib = f0 + f1;
            f0 = f1;
            f1 = currentFib;
        }
        return currentFib;
    }
}
