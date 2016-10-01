/**
 * Created by xiong on 10/1/16.
 */
public class P6 {
    public static void main(String[] args) {
        final int LIMIT = 120;
        int count = 0;
        StackOfIntegers stack = new StackOfIntegers();

        for (int number = 2; number < LIMIT; number++)
            if (isPrime(number)) {
                stack.push(number);
                count++;
            }

        System.out.println("The prime numbers less than 120 are \n");
        final int NUMBER_PER_LINE = 10;

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");

            if (stack.getSize() % NUMBER_PER_LINE == 0)
                System.out.println();
        }

    }

    public static boolean isPrime(int number) {
        boolean isPrime = true;
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}