/**
 * Created by Xiong on 9/13/2016.
 */
public class P23 {
    public static void main(String[] args) {
        int countForUpper = 0;
        int countForDigits = 0;
        for (int i = 0; i < 100; i++) {
            System.out.print(getRandomUpperCaseLetter()
                    + " ");
            countForUpper++;
            if (countForUpper % 10 == 0) {
                System.out.println();
            }
        }
        for (int i = 0; i < 100; i++) {
            System.out.print(getRandomDigitCharacter()
                    + " ");
            System.out.print(" ");
            countForDigits++;
            if (countForDigits % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
}

