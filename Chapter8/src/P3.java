import java.util.Date;

/**
 * Created by xiong on 9/28/16.
 */
public class P3 {
    public static void main(String[] args) {
        Date date = new Date();

        int count = 1;
        long time = 10000;

        while (count < 10) {
            date.setTime(time);
            System.out.println(date.toString());
            count++;
            time *= 10;
        }
    }
}
