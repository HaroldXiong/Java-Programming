/**
 * Created by Xiong on 9/13/2016.
 */
public class P26 {
    public static void main(String[] args) {
        int number = 2;
        int count = 0;
        do {
            if (isPrime(number) && isPalindrome(number)) {
                System.out.printf("%6d", number);
                count++;
                if (count % 10 == 0 && count != 0) {
                    System.out.println();
                }
            }
            number++;
        } while (count < 100);
    }

    public static int reverse(int number) {
        int result = 0;
        while (number != 0) {
            result = result * 10 + number % 10;
            number = number / 10;
        }
        return result;
    }

    public static boolean isPalindrome(int number) {
        if (number == reverse(number)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
