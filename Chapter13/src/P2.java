import java.util.Scanner;

/**
 * Created by xiong on 10/3/16.
 */
public class P2 {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0;
        boolean done = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integer:  ");
        do {
            try {
                num1 = input.nextInt();
                num2 = input.nextInt();
                done = false;
            } catch (Exception ex) {
                System.out.println("Incorrect input and re-enter two integers: ");
                input.nextLine();
            }
        } while (done);
        System.out.println("Sum is " + (num1 + num2));
    }
}
