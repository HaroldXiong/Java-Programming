import java.util.Scanner;

/**
 * Created by xiong on 9/28/16.
 */
public class P1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter SSN: ");
        String ssn = input.nextLine();
        if (isValid(ssn)) {
            System.out.println("Valid SSN");
        } else {
            System.out.println("Invalid SSN");
        }
    }

    public static boolean isValid(String ssn) {
        return ssn.length() == 11 &&
                Character.isDigit(ssn.charAt(0)) &&
                Character.isDigit(ssn.charAt(1)) &&
                Character.isDigit(ssn.charAt(2)) &&
                ssn.charAt(3) == '-' &&
                Character.isDigit(ssn.charAt(4)) &&
                Character.isDigit(ssn.charAt(5)) &&
                ssn.charAt(6) == '-' &&
                Character.isDigit(ssn.charAt(7)) &&
                Character.isDigit(ssn.charAt(8)) &&
                Character.isDigit(ssn.charAt(9)) &&
                Character.isDigit(ssn.charAt(10));
    }
}