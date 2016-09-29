import java.util.Scanner;

/**
 * Created by xiong on 9/29/16.
 */
public class P6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        System.out.println("The number of letters is " + countLetters(s));

    }

    public static int countLetters(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
