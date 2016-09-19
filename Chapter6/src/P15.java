import java.util.Scanner;

/**
 * Created by xiong on 9/19/16.
 */
public class P15 {
    public static void main(String args[]) {
        int[] numbers = new int[10];

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter ten numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        int[] result = eliminateDuplicates(numbers);

        System.out.println(
                "The number of distinct values are " + result.length);
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
    }


    public static int[] eliminateDuplicates(int[] numbers) {
        int[] temp = new int[numbers.length];
        int size = 0;

        for (int i = 0; i < numbers.length; i++) {
            boolean isInArray = false;
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    isInArray = true;
                }
            }
            if (!isInArray) {
                temp[size] = numbers[i];
                size++;
            }
        }
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = temp[i];
        }
        return result;
    }
}
