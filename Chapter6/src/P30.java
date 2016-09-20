import java.util.Scanner;

/**
 * Created by xiong on 9/20/16.
 */
public class P30 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int size = input.nextInt();

        int[] values = new int[size];

        System.out.print("Enter the values: ");
        for (int i = 0; i < values.length; i++)
            values[i] = input.nextInt();

        if (isConsecutiveFour(values))
            System.out.println("The series has consecutive fours");
        else
            System.out.println("The series has no consecutive fours");
    }

    public static boolean isConsecutiveFour(int[] values) {
        if (values.length < 4) {
            return false;
        }
        for (int i = 0; i < values.length - 3; i++) {
            if (values[i] == values[i + 1]
                    && values[i] == values[i + 2]
                    && values[i] == values[i + 3]) {
                return true;
            }
        }
        return false;
    }
}

