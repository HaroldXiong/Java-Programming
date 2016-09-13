/**
 * Created by Xiong on 9/12/2016.
 */
public class P13 {
    public static void main(String[] args) {
        System.out.println("i\t\tm(i)");
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%-2d\t\t%6.4f", i, m(i));
            System.out.println();
        }
    }

    public static double m(int i) {
        double mi = 0;
        for (int temp = 1; temp <= i; temp++) {
            mi += 1.0 * temp / (temp + 1);
        }
        return mi;
    }
}
