import java.util.Scanner;

/**
 * Created by xiong on 8/21/16.
 */
public class P5 {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 10);
        int y = (int) (Math.random() * 10);
        int z = (int) (Math.random() * 10);
        int answer = x + y + z;
        System.out.println(x + " + " + y + " + " + z + " =?");
        Scanner input = new Scanner(System.in);
        int answerOfInput = input.nextInt();
        boolean test = (answerOfInput == answer) ? true : false;
        System.out.println("Your answer is " + test);
    }
}
