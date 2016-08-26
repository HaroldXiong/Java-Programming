import java.util.Scanner;

/**
 * Created by xiong on 8/23/16.
 */
public class P10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = (int) (Math.random() * 100);
        int number2 = (int) (Math.random() * 100);
        System.out.println(number1 + " + " + number2 + " = ?");
        int answer = input.nextInt();
        boolean test = (answer == number1 + number2) ? true : false;
        System.out.println("Your answer is " + test);
    }
}
