/**
 * Created by Xiong on 2016/8/31.
 */
public class P10 {
    public static void main(String[] args) {
        System.out.println("Integer range " +
                "from 100 to 1000 for testing " +
                "which can be divided by 5 and 6.");
        int number;
        int count = 0;

        for (number = 100; number <= 1000; number++) {
            if (number % 5 == 0 && number % 6 == 0) {
                System.out.print(number + "\t");
                count++;
                if (count % 10 == 0) {
                    System.out.print("\n");
                }
            }
        }
    }
}
