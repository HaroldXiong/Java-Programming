/**
 * Created by Xiong on 2016/8/31.
 */
public class P11 {
    public static void main(String[] args) {
        System.out.println("Integers range from 100 to 200 " +
                "for testing if can be divided by " +
                "either 5 or 6 but not by both.");

        int number;
        int count = 0;

        for (number = 100; number <= 200; number++) {
            if (number % 5 == 0 || number % 6 == 0) {
                if (!(number % 5 == 0 && number % 6 == 0)) {
                    System.out.print(number + "\t");
                    count++;
                    if (count % 10 == 0) {
                        System.out.print("\n");
                    }
                }
            }
        }
    }
}
