/**
 * Created by xiong on 10/5/16.
 */
public class P4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(recursion(i));
        }

    }

    public static double recursion(double n) {
        return (n == 1) ? 1 : 1.0 / n + recursion(n - 1);
    }
}
