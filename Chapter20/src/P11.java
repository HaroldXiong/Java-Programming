/**
 * Created by xiong on 10/6/16.
 */
public class P11 {
    static int result = 0;

    public static void main(String[] args) {
        System.out.println(sumDigits(234));
    }

    static int sumDigits(long n) {
        if (n > 0) {
            result += n % 10;
            n = n / 10;
            sumDigits(n);
        }
        return result;
    }
}
