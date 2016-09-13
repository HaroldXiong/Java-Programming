import javax.swing.*;

/**
 * Created by Xiong on 9/13/2016.
 */
public class P24 {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = (totalMilliseconds / 1000);
        int currentSecond = (int) (totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        int currentMinute = (int) (totalMinutes % 60);
        long totalHours = totalMinutes / 60;
        int currentHour = (int) (totalHours % 24);
        int totalDays = (int) (totalHours / 24);
        if (currentHour > 0) totalDays++;
        int currentYear = 2000;

        do {
            currentYear++;
        } while (getTotalDaysInYears(currentYear) < totalDays);

        int totalNumOfDaysInTheYear = totalDays -
                getTotalDaysInYears(currentYear - 1);
        int currentMonth = 0;
        do {
            currentMonth++;
        } while (getTotalDaysInMonths(currentYear, currentMonth)
                < totalNumOfDaysInTheYear);

        int currentDay = totalNumOfDaysInTheYear -
                getTotalDaysInMonths(currentYear, currentMonth - 1);

        String output = "Current date and time is " +
                currentMonth + "/" + currentDay + "/" + currentYear + " " +
                currentHour + ":" +
                +currentMinute + ":" + currentSecond + " GMT";

        JOptionPane.showMessageDialog(null, output);
    }

    public static int getTotalDaysInYears(int year) {
        int total = 0;
        for (int i = 1970; i <= year; i++) {
            if (isLeapYear(i)) {
                total = total + 366;
            } else {
                total = total + 365;
            }
        }
        return total;
    }

    public static int getTotalDaysInMonths(int year, int month) {
        int total = 0;
        for (int i = 1; i <= month; i++) {
            total += getNumOfDaysInMonth(year, i);
        }
        return total;
    }

    public static int getNumOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12) {
            return 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else if (month == 2) {
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        }
        return 0;
    }

    public static boolean isLeapYear(int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return true;
        } else {
            return false;
        }
    }

}
