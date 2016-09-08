import java.util.Scanner;

/**
 * Created by xiong on 8/21/16.
 */
public class P4 {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 100);
        int y = (int) (Math.random() * 100);
        int answer = x + y;
        Scanner input = new Scanner(System.in);
        System.out.println(x + " + " + y + " = ?");
        int answerOfInput = input.nextInt();
        boolean test = (answerOfInput == answer) ? true : false;
        System.out.println("Your anwser is " + test);
    }
}
