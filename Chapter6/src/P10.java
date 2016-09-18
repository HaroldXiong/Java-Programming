import java.util.Scanner;

/**
 * Created by xiong on 9/18/16.
 */
public class P10 {
    public static int indexOfSmallestElement(double[] array) {
        int index = 0;
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] array = new double[10];
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }
        System.out.println(indexOfSmallestElement(array));
    }
}
