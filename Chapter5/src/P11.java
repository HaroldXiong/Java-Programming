/**
 * Created by Xiong on 9/12/2016.
 */
public class P11 {
    public static void main(String[] args) {
        System.out.println("Sales Amount\t\tCommission");
        for (double salesAmount = 10000; salesAmount <= 100000;
             salesAmount += 5000) {
            System.out.printf("%-12.0f\t\t%.1f", salesAmount,
                    computeCommission(salesAmount));
            System.out.println();
        }
    }

    public static double computeCommission(double salesAmount) {
        double commission;

        if (salesAmount >= 10000.01)
            commission = 5000 * 0.08 + 5000 * 0.1
                    + (salesAmount - 10000) * 0.12;
        else if (salesAmount >= 5000.01)
            commission = 5000 * 0.08
                    + (salesAmount - 5000) * 0.10;
        else
            commission = salesAmount * 0.08;

        return commission;
    }

}
