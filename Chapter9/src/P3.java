import java.util.Scanner;

/**
 * Created by xiong on 9/29/16.
 */
public class P3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string for password: ");
        String s = input.nextLine();

        if (isValidPassword(s)) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }

    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetter(password.charAt(i)) &&
                    !Character.isDigit(password.charAt(i))) {
                return false;
            }
        }

        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                count++;
            }
        }

        if (count >= 2) {
            return true;
        } else {
            return false;
        }
    }
}
