/**
 * Created by Xiong on 9/4/2016.
 */
public class P25 {
    double pi;


    public static void main(String[] args) {
        int input = 10000;
        for (; input <= 100000; input += 10000) {
            System.out.println(Pi(input));
        }
    }

    public static double Pi(int input) {
        double piInPi = 0;
        for (int i = 1; i <= input; i += 2) {
            piInPi += 1.0 / (2 * i - 1) - 1.0 / (2 * i + 1);
        }
        return 4 * piInPi;
    }
}
