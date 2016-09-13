/**
 * Created by Xiong on 9/13/2016.
 */
public class P28 {
    public static void main(String[] args) {
        System.out.println("p\t\t\t2^p-1");
        for (int p = 2; p <= 31; p++) {
            int i = (int) (Math.pow(2, p) - 1);

            if (isPrime(i)) {
                System.out.println(p + "\t\t\t" + i);
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
