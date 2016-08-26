import java.util.Scanner;

/**
 * Created by xiong on 8/25/16.
 */
public class P17 {
    public static void main(String[] args) {
        System.out.println("scissor(0), rock(1), paper(2): ");
        int computer = (int) (Math.random() * 3);
        Scanner input = new Scanner(System.in);
        int player = input.nextInt();
        String wordOfComputer = new String();
        String wordOfPlayer = new String();
        String result = new String();
        switch (computer) {
            case 0:
                wordOfComputer = "scissor";
                break;
            case 1:
                wordOfComputer = "rock";
                break;
            case 2:
                wordOfComputer = "paper";
                break;
        }
        switch (player) {
            case 0:
                wordOfPlayer = "scissor";
                break;
            case 1:
                wordOfPlayer = "rock";
                break;
            case 2:
                wordOfPlayer = "paper";
                break;
        }
        if ((computer == 0 && player == 1)
                || (computer == 1 && player == 2)
                || (computer == 2 && player == 0)) {
            result = "You won.";
        } else if (computer == player) {
            result = "It is a draw.";
        } else if ((computer == 2 && player == 1)
                || (computer == 1 && player == 0)
                || (computer == 0 && player == 2)) {
            result = "You lost.";
        } else {
            System.out.println("You entered wrong number! ");
            System.exit(0);
        }
            System.out.println("The computer is " + wordOfComputer + ". "
                    + "You are " + wordOfPlayer + ". " + result);
    }
}
