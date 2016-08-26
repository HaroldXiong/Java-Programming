import java.util.Scanner;

/**
 * Created by xiong on 8/21/16.
 */
public class P2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int integer = input.nextInt();
        boolean evenTest = (integer % 2 == 0) ? true : false;
        System.out.println("Is " + integer + " an even number? " + evenTest);
    }
}
