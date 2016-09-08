/**
 * Created by Xiong on 2016/9/1.
 */
public class P20 {
    public static void main(String[] args) {
        final int NUMBER_PER_LINE = 8;
        int count = 0; //Count the number of prime numbers.
        int number = 2;

        System.out.println("The prime numbers from 2 to 1000:");

        while (number <= 1000) {
            boolean isPrime = true;

            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                String space = new String();
                if (number >= 100) {
                    space = " ";
                } else if (number >= 10) {
                    space = "  ";
                } else {
                    space = "   ";
                }
                count++;
                if (count % NUMBER_PER_LINE == 0) {
                    System.out.println(number);
                } else {
                    System.out.print(number + space);
                }
            }
            number++;
        }
    }
}
