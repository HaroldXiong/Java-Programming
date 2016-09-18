import java.util.Scanner;

/**
 * Created by xiong on 9/17/16.
 */
public class P3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers range from 1 to 100," +
                " and end with 0: ");
        int number = input.nextInt();
        int[] array = new int[100];

        while (number != 0) {
            array[number - 1]++;
            number = input.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                System.out.println((i + 1) + " occurs " + array[i] + " times");
            }
        }

    }
}
