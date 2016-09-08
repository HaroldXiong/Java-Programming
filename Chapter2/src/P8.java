import java.util.Scanner;

/**
 * Created by xiong on 8/18/16.
 */
public class P8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an ASCII code:");
        byte word = input.nextByte();
        System.out.println("The character for ASCII code " + word + " is " + (char) word);
    }
}
