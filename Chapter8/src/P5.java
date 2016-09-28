import java.util.GregorianCalendar;

/**
 * Created by xiong on 9/28/16.
 */
public class P5 {
    public static void main(String[] args) {
        GregorianCalendar now = new GregorianCalendar();
        System.out.println(now.get(GregorianCalendar.YEAR)
                + " " + now.get(GregorianCalendar.MONTH)
                + " " + now.get(GregorianCalendar.DAY_OF_MONTH));

        now.setTimeInMillis(1234567898765L);
        System.out.println(now.get(GregorianCalendar.YEAR)
                + " " + now.get(GregorianCalendar.MONTH)
                + " " + now.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
