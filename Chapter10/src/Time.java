/**
 * Created by xiong on 10/1/16.
 */
public class Time {
    private int hour, minute, second;

    public Time() {
        this(System.currentTimeMillis());
    }

    public Time(long elapseTime) {
        long totalSeconds = elapseTime / 1000;
        second = (int)(totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        minute = (int)(totalMinutes % 60);
        int totalHours = (int)(totalMinutes / 60);
        hour = (totalHours % 24);
    }

    public String toString() {
        return hour + ":" + minute + ":" + second + " GMT";
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
}
