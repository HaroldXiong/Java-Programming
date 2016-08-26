import java.util.Scanner;

/**
 * Created by xiong on 8/25/16.
 */
public class P14 {
    public static void main(String[] args) {
        int coin = (int) (Math.random() * 3);
        System.out.println("Enter 0 or 1 to guess the coin's face: ");
        Scanner input = new Scanner(System.in);
        int coinOfInput = input.nextInt();
        boolean test = (coin == coinOfInput) ? true : false;
        System.out.println("Your guess is " + test);
    }
}
