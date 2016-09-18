/**
 * Created by xiong on 9/18/16.
 */
public class P13 {
    public static int getRandom(int... numbers) {
        int value;
        label:
        while (true) {
            value = 1 + (int) (Math.random() * 54);
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == value) {
                    continue label;
                }
            }
            return value;
        }
    }

    public static void main(String[] args) {
        System.out.println(getRandom(1, 2, 3, 10));
    }
}
