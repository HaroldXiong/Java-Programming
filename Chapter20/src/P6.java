/**
 * Created by xiong on 10/6/16.
 */
public class P6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(m(i));
        }
    }

    public static double m(double n) {
        return (n == 1) ? 1.0 / 2 : m(n - 1) + n / (n + 1);
    }
}
