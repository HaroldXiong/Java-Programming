import java.util.Scanner;

/**
 * Created by xiong on 8/26/16.
 */
public class P21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year: (e.g., 2008): ");
        int year = input.nextInt();
        System.out.println("Enter month: 1-12: ");
        int month = input.nextInt();
        System.out.println("Enter the day of the month: 1-31: ");
        int day = input.nextInt();

        if (month <= 2) {
            month += 12;
        }
        int dayOfWeek = (day + (26 * (month + 1) / 10) + year % 100
                + (year % 100) / 4 + year / 100 / 4 + 5 * (year / 100)) % 7;

        String dayName = new String();
        switch (dayOfWeek) {
            case 0:
                dayName = "Saturday";
                break;
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
        }
        System.out.println("Day of the week is " + dayName);
    }
}
