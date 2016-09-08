/**
 * Created by Xiong on 9/8/2016.
 */
public class P33 {
    public static void main(String[] args) {
        for (int number = 6; number <= 10000; number++) {
            int sum = 0;
            for (int divisor = 1; divisor < number; divisor++) {
                if (number % divisor == 0) {
                    sum += divisor;
                }
            }
            if (sum == number) {
                System.out.println(number);
            }
        }
    }
}
