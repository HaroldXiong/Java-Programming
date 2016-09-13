/**
 * Created by Xiong on 9/13/2016.
 */
public class P14 {
    public static void main(String[] args) {
        System.out.println("i\t\tm(i)");
        for (int i = 10; i <= 100; i += 10) {
            System.out.printf("%-3d\t\t%6.5f", i, m(i));
            System.out.println();
        }
    }

    public static double m(int i) {
        double mi = 0;
        for (int temp = 1; temp <= i; temp += 2) {
            mi += 1.0 / (2 * temp - 1) - 1.0 / (2 * temp + 1);
        }
        return 4 * mi;
    }
}
