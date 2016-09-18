/**
 * Created by xiong on 9/18/16.
 */
public class P6 {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        int[] array = new int[50];

        while (count < 50) {
            if (isPrime(number)) {
                array[count] = number;
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
            number++;
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
