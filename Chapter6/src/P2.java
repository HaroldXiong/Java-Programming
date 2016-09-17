import java.util.Scanner;

/**
 * Created by xiong on 9/17/16.
 */
public class P2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        int[] number = new int[10];
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextInt();
        }
        int[] array = reverse(number);

        for (int n : number) {
            System.out.print(n + " ");
        }
        System.out.println();
        for (int n : array) {
            System.out.print(n + " ");
        }
    }

    public static int[] reverse(int[] number) {
        int[] array = new int[number.length];

        for (int i = 0; i < number.length; i++) {
            array[i] = number[number.length - i - 1];
        }
        return array;
    }
}
