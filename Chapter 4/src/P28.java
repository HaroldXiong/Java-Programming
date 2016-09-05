import java.util.Scanner;

/**
 * Created by Xiong on 9/5/2016.
 */
public class P28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = input.nextInt();

        System.out.println("Enter the first day of the year: " +
                "\n 0 for Sunday, 1 for Monday and so on.");
        int firstDay = input.nextInt();

        int numberOfDaysInMonth = 0;

        for (int month = 1; month <= 12; month++) {
            switch (month) {
                case 1:
                    System.out.print("January 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    break;
                case 2:
                    System.out.print("February 1, " + year + " is ");
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        numberOfDaysInMonth = 29;
                    } else {
                        numberOfDaysInMonth = 28;
                    }
                    break;
                case 3:
                    System.out.print("March 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    break;
                case 4:
                    System.out.print("April 1, " + year + " is ");
                    numberOfDaysInMonth = 30;
                    break;
                case 5:
                    System.out.print("May 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    break;
                case 6:
                    System.out.print("June 1, " + year + " is ");
                    numberOfDaysInMonth = 30;
                    break;
                case 7:
                    System.out.print("July 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    break;
                case 8:
                    System.out.print("August 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    break;
                case 9:
                    System.out.print("September 1, " + year + " is ");
                    numberOfDaysInMonth = 30;
                    break;
                case 10:
                    System.out.print("October 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    break;
                case 11:
                    System.out.print("November 1, " + year + " is ");
                    numberOfDaysInMonth = 30;
                    break;
                case 12:
                    System.out.print("December 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    break;
            }
            switch (firstDay) {
                case 0:
                    System.out.println("Sunday");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
            }
            firstDay = (firstDay + numberOfDaysInMonth) % 7;
        }
    }
}
