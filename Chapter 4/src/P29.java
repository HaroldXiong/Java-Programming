import java.util.Scanner;

/**
 * Created by Xiong on 9/5/2016.
 */
public class P29 {
    public static void main(String[] args) {
        String months = new String();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year and the " +
                "first day of the year: ");
        int year = input.nextInt();
        int firstDay = input.nextInt();
        int numberOfDaysInMonth = 0;
        int startDay = firstDay;

        for (int monthTest = 1; monthTest <= 12; monthTest++) {
            switch (monthTest) {
                case 1:
                    months = "January";
                    numberOfDaysInMonth = 31;
                    break;
                case 2:
                    months = "February";
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        numberOfDaysInMonth = 29;
                    } else {
                        numberOfDaysInMonth = 28;
                    }
                    break;
                case 3:
                    months = "March";
                    numberOfDaysInMonth = 31;
                    break;
                case 4:
                    months = "April";
                    numberOfDaysInMonth = 30;
                    break;
                case 5:
                    months = "May";
                    numberOfDaysInMonth = 31;
                    break;
                case 6:
                    months = "June";
                    numberOfDaysInMonth = 30;
                    break;
                case 7:
                    months = "July";
                    numberOfDaysInMonth = 31;
                    break;
                case 8:
                    months = "August";
                    numberOfDaysInMonth = 31;
                    break;
                case 9:
                    months = "September";
                    numberOfDaysInMonth = 30;
                    break;
                case 10:
                    months = "October";
                    numberOfDaysInMonth = 31;
                    break;
                case 11:
                    months = "November";
                    numberOfDaysInMonth = 30;
                    break;
                case 12:
                    months = "December";
                    numberOfDaysInMonth = 31;
                    break;
            }
            System.out.println("\t  " + months + " " + year);
            System.out.println(" ---------------------------");
            System.out.println(" Sun Mon Tue Wed Thu Fri Sat");


            int i = 0;
            for (i = 0; i < startDay; i++)
                System.out.print("    ");

            for (i = 1; i <= numberOfDaysInMonth; i++) {
                if (i < 10)
                    System.out.print("   " + i);
                else
                    System.out.print("  " + i);

                if ((i + startDay) % 7 == 0)
                    System.out.println();
            }

            System.out.println();
            System.out.println();

            startDay = (startDay + numberOfDaysInMonth) % 7;
        }
    }
}
