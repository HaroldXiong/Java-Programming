/**
 * Created by xiong on 9/18/16.
 */
public class P14 {
    public static void main(String args[]) {
        System.out.println(gcd(33, 33, 33, 11, 22));
    }


    public static int gcd(int... numbers) {
        int gcd = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            gcd = gcd(gcd, numbers[1]);
        }
        return gcd;
    }

    public static int gcd(int n1, int n2) {
        int gcd = 1;
        int k = 1;

        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
            k++;
        }

        return gcd;
    }
}
