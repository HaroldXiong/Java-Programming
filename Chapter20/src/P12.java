/**
 * Created by xiong on 10/6/16.
 */
public class P12 {
    public static void main(String[] args) {
        reverseDisplay("I'm CEO, bitch");
    }

    public static void reverseDisplay(String value) {
        reverseDisplay(value, value.length() - 1);
    }

    public static void reverseDisplay(String value, int high) {
        if (high >= 0) {
            System.out.print(value.charAt(high));
            reverseDisplay(value, high - 1);
        }
    }
}
