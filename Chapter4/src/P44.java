/**
 * Created by Xiong on 9/9/2016.
 */
public class P44 {
    public static void main(String[] args) {
        double count = 0;
        for (int i = 1; i <= 1000000; i++) {
            double x = Math.random() * 2 - 1;
            double y = Math.random() * 2 - 1;

            if (x < 0 || (y > 0 && x > 0 && x < 1 - y)) {
                count++;
            }
        }
        System.out.println(count / 1000000);
    }
}
