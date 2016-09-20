import java.util.Scanner;

/**
 * Created by xiong on 9/20/16.
 */
public class P28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten integers: ");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        printCombines(numbers);
    }

    public static void printCombines(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.println(numbers[i] + " " + numbers[j]);
            }
        }
    }
}
