import java.util.Scanner;

/**
 * Created by xiong on 9/18/16.
 */
public class P5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten number: ");
        int[] numbers = new int[10];
        boolean isNew = true;
        int count = 1;
        numbers[0] = input.nextInt();
        System.out.print(numbers[0] + " ");

        for (int i = 1; i < 10; i++) {
            int temp = input.nextInt();

            for (int j = 0; j < i; j++) {
                if (numbers[j] == temp) {
                    isNew = false;
                }
            }
            if (isNew) {
                numbers[count] = temp;
                System.out.print(numbers[count] + " ");
                count++;
            }
            isNew = true;
        }

    }
}
