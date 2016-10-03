/**
 * Created by xiong on 10/3/16.
 */
public class P1 {
    public static void main(String[] args) {
        int num1, num2, result = 0;
        if (args.length != 3) {
            System.out.println("Please use Java" +
                    " Exercise13_1 operand1 operator operand2.");
        }
        try {
            num1 = Integer.parseInt(args[0]);
        } catch (NumberFormatException ex) {
            System.out.println("Wrong Input: " + args[0]);
        }
        try {
            num2 = Integer.parseInt(args[2]);
        } catch (NumberFormatException ex) {
            System.out.println("Wrong Input: " + args[2]);
        }

        switch (args[1].charAt(0)) {
            case '+':
                result = Integer.parseInt(args[0])
                        + Integer.parseInt(args[2]);
                break;
            case '-':
                result = Integer.parseInt(args[0])
                        - Integer.parseInt(args[2]);
                break;
            case '*':
                result = Integer.parseInt(args[0])
                        * Integer.parseInt(args[2]);
                break;
            case '/':
                result = Integer.parseInt(args[0])
                        / Integer.parseInt(args[2]);
        }
        System.out.println(args[0] + " " + args[1]
                + " " + args[2] + " = " + result);
    }
}

