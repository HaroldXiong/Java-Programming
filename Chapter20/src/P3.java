/**
 * Created by xiong on 10/5/16.
 */
public class P3 {
    public static void main(String[] args) {
        System.out.println(gcd(24, 16));
        System.out.println(gcd(255, 25));
    }

    public static int gcd(int m, int n) {
        return (m % n == 0) ? n : gcd(n, m % n);
    }
}
