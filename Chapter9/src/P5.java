import java.util.Scanner;

/**
 * Created by xiong on 9/29/16.
 */
public class P5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        int[] counts = count(s);

        for (int i = 0; i < 10; i++) {
            System.out.println("Digit " + i + " occurs " + counts[i] +
                    " times");
        }

    }

    public static int[] count(String s) {
        int[] number = new int[10];
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                number[s.charAt(i) - '0']++;
            }
        }
        return number;
    }
}
