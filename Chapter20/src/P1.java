import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by xiong on 10/5/16.
 */
public class P1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer of any size.");
        String number = input.nextLine();
        BigInteger bigInteger = new BigInteger(number);
        System.out.println(factorial(bigInteger));
    }

    public static BigInteger factorial(BigInteger n) {
        return (n.equals(BigInteger.ZERO))
                ? BigInteger.ONE : n.multiply(
                factorial(n.subtract(BigInteger.ONE)));
    }
}
