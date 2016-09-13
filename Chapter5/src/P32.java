/**
 * Created by xiong on 9/14/16.
 */
public class P32 {
    public static void main(String[] args) {
        int numberOfWins = 0;
        for (int i = 0; i < 10000; i++) {
            numberOfWins += play() ? 1 : 0;
        }
        System.out.println("Win times are :" + numberOfWins);
    }

    public static boolean play() {
        int dice1 = getDice();
        int dice2 = getDice();
        int dice = dice1 + dice2;
        if (dice == 7 || dice == 11) {
            return true;
        } else if (dice == 2 || dice == 3 || dice == 12) {
            return false;
        }
        int point = dice;
        do {
            dice1 = getDice();
            dice2 = getDice();
            dice = dice1 + dice2;
        } while (dice != 7 && dice != point);

        if (dice == 7) {
            return false;
        } else {
            return true;
        }
    }

    public static int getDice() {
        return (int) (Math.random() * 6 + 1);
    }
}
