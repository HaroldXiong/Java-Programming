/**
 * Created by xiong on 10/6/16.
 */
public class P25 {
    public static void main(String[] args) {
        displayPermuation("abcd");
    }

    public static void displayPermuation(String s) {
        displayPermuation("", s);
    }

    public static void displayPermuation(String s1, String s2) {
        if (s2.length() > 0) {
            for (int i = 0; i < s2.length(); i++) {
                displayPermuation(s1 + s2.charAt(i),
                        s2.substring(0, i) + s2.substring(i + 1));
            }
        } else {
            System.out.println(s1);
        }
    }

}
