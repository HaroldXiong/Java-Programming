/**
 * Created by xiong on 9/29/16.
 */
public class P4 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        System.out.print("Enter a character: ");
        char ch = input.nextLine().charAt(0);

        int count = count(s, ch);
        System.out.println(count);

    }

    public static int count(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }
        return count;
    }
}
