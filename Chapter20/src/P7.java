import java.util.Scanner;

/**
 * Created by xiong on 10/6/16.
 */
public class P7 {
    static int count = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an index for the Fibonacci number:");
        int index = input.nextInt();

        System.out.println("Fibonacci number at index "
                + index + " is " + fib(index)
                + " uses the method for " + count + " times.");
    }

    public static long fib(long index) {
        count++;
        if (index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else {
            return fib(index - 1) + fib(index - 2);
        }
    }
}
