/**
 * Created by Xiong on 9/13/2016.
 */
public class P16 {
    public static void main(String[] args) {
        System.out.println("Year\t\tDay in year");
        for (int year = 2000; year <= 2010; year++) {
            System.out.printf("%4d\t\t%3d", year,
                    numberOfDaysInAYear(year));
            System.out.println();
        }
    }

    public static int numberOfDaysInAYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0)
                || (year % 400 == 0)) {
            return 366;
        } else {
            return 365;
        }
    }
}
