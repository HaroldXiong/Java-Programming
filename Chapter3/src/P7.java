import java.util.Scanner;

/**
 * Created by xiong on 8/23/16.
 */
public class P7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an amount in Integer, " +
                "for example 1156 \nfor 11 dollars and 56 cents: ");
        int amount = input.nextInt();
        int remainingAmount = amount;
        int numberOfOneDollar = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        int numberOfPennies = remainingAmount;
        System.out.println("Your amount " + amount + " consists of ");
        if (numberOfOneDollar != 0) {
            System.out.println(numberOfOneDollar + "\t dollars");
        }
        if (numberOfQuarters != 0) {
            System.out.println(numberOfQuarters + "\t quarters");
        }
        if (numberOfDimes != 0) {
            System.out.println(numberOfDimes + "\t dimes");
        }
        if (numberOfNickels != 0) {
            System.out.println(numberOfNickels + "\t nickels");
        }
        if (numberOfPennies != 0) {
            System.out.println(numberOfPennies + "\t pennies");
        }
    }
}
