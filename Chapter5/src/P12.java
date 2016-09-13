/**
 * Created by Xiong on 9/12/2016.
 */
public class P12 {
    public static void main(String[] args) {
        printChars('1', 'z', 10);
    }

    public static void printChars(char ch1, char ch2, int numberPerLine) {
        int count = 0;
        for (int i = ch1; i <= ch2; i++) {
            System.out.print((char) i);
            count++;
            if (count % numberPerLine == 0) {
                System.out.println();
            }
        }
    }
}
