/**
 * Created by Xiong on 2016/8/31.
 */
public class P14 {
    public static void main(String[] args) {
        char number;
        int count = 0;
        for (number = 33; number < 127; number++) {
            System.out.print(number + "\t");
            count++;
            if (count % 10 == 0) {
                System.out.print("\n");
            }
        }
    }
}
