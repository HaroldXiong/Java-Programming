/**
 * Created by xiong on 10/3/16.
 */
public class P9 {
    public static void main(String[] args) throws BinaryFormatException {
        System.out.println(parseBinary("10001"));
        System.out.println(parseBinary("141111111"));
    }

    public static int parseBinary(String binaryString) throws BinaryFormatException {
        int value = 0;

        for (int i = 0; i < binaryString.length(); i++) {
            char ch = binaryString.charAt(i);
            if (ch == '0' || ch == '1')
                value = value * 2 + binaryString.charAt(i) - '0';
            else
                throw new BinaryFormatException("Illegal character: " + ch);
        }

        return value;
    }
}
