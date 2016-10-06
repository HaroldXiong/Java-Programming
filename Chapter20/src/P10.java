import java.util.Scanner;

/**
 * Created by xiong on 10/6/16.
 */
public class P10 {
    static int count = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String string = input.nextLine();
        System.out.println("Enter the character: ");
        char a = input.next().charAt(0);
        System.out.println(count(string, a));
    }

    public static int count(String str, char a) {
        if (str.length() > 0) {
            if (str.charAt(0) == a) {
                count++;
            }
            count(str.substring(1, str.length()), a);
        }
        return count;
    }
}
