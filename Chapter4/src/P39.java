/**
 * Created by Xiong on 9/9/2016.
 */
public class P39 {
    public static void main(String[] args) {
        final double TARGET_AMOUNT = 30000;
        final double INITIAL_SALES_AMOUNT = 0.01;
        double commission = 0;
        double salesAmount = INITIAL_SALES_AMOUNT;

        do {
            salesAmount += 0.01;

            if (salesAmount >= 10000.01) {
                commission = 5000 + 5000 * 0.08 + 5000 * 0.1
                        + (salesAmount - 10000) * 0.12;
            } else if (salesAmount >= 5000.01) {
                commission = 5000 + 5000 * 0.08
                        + (salesAmount - 5000) * 0.1;
            } else {
                commission = 5000 + salesAmount * 0.08;
            }
        } while (commission < TARGET_AMOUNT);
        System.out.println("The sales amount $"
                + (int) (salesAmount * 100) / 100.0
                + "\nis needed to make a commission of $"
                + TARGET_AMOUNT);
    }
}
