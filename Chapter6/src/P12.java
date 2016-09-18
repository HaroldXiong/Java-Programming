import java.util.Scanner;

/**
 * Created by xiong on 9/18/16.
 */
public class P12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        int[] number = new int[10];
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextInt();
        }
        int[] array = reverse(number);

        System.out.println();
        for (int n : array) {
            System.out.print(n + " ");
        }
    }

    public static int[] reverse(int[] number) {
        int[] array = new int[number.length];

        for (int i = 0, j = array.length - 1;
             i < number.length; i++, j--) {
            array[j] = number[i];
        }
        return array;
    }
}
