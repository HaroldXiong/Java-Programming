/**
 * Created by xiong on 10/1/16.
 */
public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return isEven(value);
    }

    public static boolean isEven(int value) {
        return (value % 2 == 0);
    }

    public static boolean isEven(MyInteger n) {
        return isEven(n.getValue());
    }

    public boolean isOdd() {
        return isOdd(value);
    }

    public static boolean isOdd(int value) {
        return (value % 2 == 1);
    }

    public static boolean isOdd(MyInteger n) {
        return isOdd(n.getValue());
    }

    public boolean isPrime() {
        return isPrime(value);
    }

    public static boolean isPrime(MyInteger n) {
        return isPrime(n.getValue());
    }

    public static boolean isPrime(int num) {
        if ((num == 1) || (num == 2)) {
            return true;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(int num) {
        return value == num;
    }

    public boolean equals(MyInteger n) {
        return value == n.getValue();
    }

    public static int parseInt(char[] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result = result * 10 + (a[i] - '0');
        }
        return result;
    }

    public static int parseInt(String string) {
        int result = 0;
        for (int i = 0; i < string.length(); i++) {
            result = result * 10 + (string.charAt(i) - '0');
        }
        return result;
    }
}
