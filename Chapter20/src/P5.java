/**
 * Created by xiong on 10/6/16.
 */
public class P5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(m(i));
        }
    }

    public static double m(double n) {
        return (n == 1) ? 1.0 / 3 : n / (2 * n + 1) + m(n - 1);
    }
}
