/**
 * Created by Xiong on 9/13/2016.
 */
public class P30 {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            if (isPrime(i)) {
                if (isPrime(i + 2)) {
                    System.out.println("(" + i + ", " + (i + 2) + ")");
                }
            }
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
