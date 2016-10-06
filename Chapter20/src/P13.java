/**
 * Created by xiong on 10/6/16.
 */
public class P13 {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 9};
        System.out.println(Max(number));
    }

    public static int Max(int[] number) {
        return Max(number, number.length - 1);
    }

    public static int Max(int[] number, int high) {
        if (high == 0) {
            return number[0];
        } else {
            return Math.max(Max(number, high - 1), number[high]);
        }
    }
}
