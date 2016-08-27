/**
 * Created by xiong on 8/26/16.
 */
public class P24 {
    public static void main(String[] args) {
        int numberOfCard = (int) (Math.random() * 52);
        String designOfCard = new String();

        switch (numberOfCard % 4) {
            case 0:
                designOfCard = "Diamond";
                break;
            case 1:
                designOfCard = "Heart";
                break;
            case 2:
                designOfCard = "Spades";
                break;
            case 3:
                designOfCard = "Clubs";
        }
        int number = numberOfCard / 4;
        String numberInString = new String();
        if (number == 1) {
            numberInString = "Ace";
        } else if (number == 11) {
            numberInString = "Jack";
        } else if (number == 12) {
            numberInString = "Queen";
        } else if (number == 0) {
            numberInString = "King";
        } else {
            numberInString = String.valueOf(number);
        }
        System.out.println("The card you picked is "
                + numberInString + " of " + designOfCard + ".");
    }
}
