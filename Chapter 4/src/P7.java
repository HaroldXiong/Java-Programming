/**
 * Created by Xiong on 2016/8/30.
 */
public class P7 {
    public static void main(String[] args) {
        double tuition = 10000;
        int year = 1;
        double total = 0;
        while (year <= 14) {
            tuition *= 1.05;
            year++;
            if (year == 10) {
                System.out.println("The tenth year's tuition is "
                        + (int) (tuition * 100) / 100.0);
            }
            if (year > 10) {
                total += tuition;
            }
        }
        System.out.println("Four years after tenth year's total tuition is "
                + (int) (total * 100) / 100.0);
    }
}
