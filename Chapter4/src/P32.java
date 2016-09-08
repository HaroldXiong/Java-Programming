import java.util.Scanner;

/**
 * Created by Xiong on 9/8/2016.
 */
public class P32 {
    public static void main(String[] args) {
        int initialLottery = (int) (Math.random() * 10);
        int nextLottery;
        do {
            nextLottery = (int) (Math.random() * 10);
        } while (nextLottery == initialLottery);
        int lottery = initialLottery * 10 + nextLottery;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your lottery pick (two digits): ");
        int guess = input.nextInt();

        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println("The lottery number is " + lottery);

        if (guess == lottery) {
            System.out.println("Exact match: you win $10,000");
        } else if (initialLottery == guessDigit2
                && nextLottery == guessDigit1) {
            System.out.println("Match all digits: you win $3,000");
        } else if (initialLottery == guessDigit1 || initialLottery == guessDigit2
                || nextLottery == guessDigit1 || nextLottery == guessDigit2) {
            System.out.println("Match one digit: you win $1,000");
        } else {
            System.out.println("Sorry, no match");
        }
    }
}
