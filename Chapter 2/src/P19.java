/**
 * Created by xiong on 8/19/16.
 */
public class P19 {
    public static void main(String[] args) {
        int time = (int) (System.currentTimeMillis() % 26);
        char value = (char) ('A' + time);
        System.out.println(value);
    }
}
