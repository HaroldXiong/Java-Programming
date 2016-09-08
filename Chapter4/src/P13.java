/**
 * Created by Xiong on 2016/8/31.
 */
public class P13 {
    public static void main(String[] args) {
        int number = 0;
        while (number * number * number < 12000) {
            number++;
        }
        System.out.println(number-1);
    }
}
