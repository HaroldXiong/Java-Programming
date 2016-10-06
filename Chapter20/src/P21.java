/**
 * Created by xiong on 10/6/16.
 */
public class P21 {
    public static void main(String[] args) {
        System.out.println(decimalToBinary(8));
        System.out.println(decimalToBinary(9));
        System.out.println(decimalToBinary(10));
        System.out.println(decimalToBinary(11));
    }

    public static String decimalToBinary(int value) {
        return (value == 0) ? "" : decimalToBinary(value / 2) + value % 2;
    }
}
