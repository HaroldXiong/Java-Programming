import java.util.Scanner;

/**
 * Created by Xiong on 9/9/2016.
 */
public class P41 {
    public static void main(String[] args) {
        System.out.println("Enter numbers: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int largestNumber = number;
        int times = 1;
        while (number != 0) {
            number = input.nextInt();
            if (number > largestNumber) {
                largestNumber = number;
                times = 1;
            } else if (number == largestNumber) {
                times++;
            }
        }
        System.out.println("The largest number is "
                + largestNumber);
        System.out.println("The occurrence count " +
                "of the largest number is " + times);
    }
}