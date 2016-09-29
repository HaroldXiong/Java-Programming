import java.util.Scanner;

/**
 * Created by xiong on 9/29/16.
 */
public class P2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the bigger string: ");
        String bigger = input.nextLine();
        System.out.println("Enter the smaller string: ");
        String smaller = input.nextLine();
        if (bigger.indexOf(smaller) > 0) {
            System.out.println("The " + smaller
                    + " is the substring of " + bigger);
        } else {
            System.out.println("The " + smaller
                    + " is not the substring of " + bigger);
        }
    }
}
