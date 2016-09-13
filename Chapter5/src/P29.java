/**
 * Created by Xiong on 9/13/2016.
 */
public class P29 {
    public static void main(String[] args) {
        int dice1 = getDice();
        int dice2 = getDice();
        int dice = dice1 + dice2;
        System.out.println("You rolled " + dice1 + " + "
                + dice2 + " = " + dice);
        if (dice == 7 || dice == 11) {
            System.out.println("You win");
            System.exit(0);
        } else if (dice == 2 || dice == 3 || dice == 12) {
            System.out.println("You lose");
            System.exit(0);
        }
        int point = dice;
        System.out.println("point is " + point);
        do {
            dice1 = getDice();
            dice2 = getDice();
            dice = dice1 + dice2;
        } while (dice != 7 && dice != point);

        if (dice == 7) {
            System.out.println("You rolled " + dice1 + " + "
                    + dice2 + " = " + dice);
            System.out.println("You lose");
        } else {
            System.out.println("You win");
        }
    }


    public static int getDice() {
        return (int) (Math.random() * 6 + 1);
    }
}
