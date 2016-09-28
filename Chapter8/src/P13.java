import java.util.Scanner;

/**
 * Created by xiong on 9/28/16.
 */
public class P13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print
                ("Enter the number of rows and columns of the array: ");
        int numberOfRows = input.nextInt();
        int numberOfColumns = input.nextInt();

        double[][] a = new double[numberOfRows][numberOfColumns];

        System.out.println("Enter the array: ");
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                a[i][j] = input.nextDouble();

        Location location = locateLargest(a);
        System.out.println("The location of the largest element is "
                + location.maxValue + " at ("
                + location.row + ", " + location.column + ")");

    }

    public static Location locateLargest(double[][] a) {
        Location location = new Location();
        location.maxValue = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (location.maxValue < a[i][j]) {
                    location.maxValue = a[i][j];
                    location.row = i;
                    location.column = j;
                }
            }
        }
        return location;
    }
}

class Location {
    public int row, column;
    public double maxValue;
}
