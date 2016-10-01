import java.util.Scanner;

/**
 * Created by xiong on 10/1/16.
 */
public class P5 {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers(2);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("The factors for " + number + " is");
        int factor = 2;
        while (factor <= number) {
            if (number % factor == 0) {
                number = number / factor;
                stack.push(factor);
            } else {
                factor++;
            }
        }

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }

}
