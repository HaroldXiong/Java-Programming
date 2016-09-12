/**
 * Created by Xiong on 9/12/2016.
 */
public class P9 {
    public static void main(String[] args) {
        System.out.println("Foot\t\tMeter\t\tMeter\t\tFoot");
        for (double i = 1.0; i <= 10.0; i++) {
            System.out.printf("%-4.1f\t\t%-5.3f\t\t%-5.1f\t\t%-4.3f",
                    i, footToMeter(i), 5 * i + 15,
                    meterToFoot(5 * i + 15));
            System.out.println();
        }
    }

    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    public static double meterToFoot(double meter) {
        return meter / 0.305;
    }
}
