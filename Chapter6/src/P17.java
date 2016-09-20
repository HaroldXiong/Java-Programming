import java.util.Scanner;

/**
 * Created by xiong on 9/20/16.
 */
public class P17 {
    public static double[] selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double currentMax = list[i];
            int currentMaxIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMax < list[j]) {
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }
            if (currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        double[] list = new double[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextDouble();
        }
        double[] newList = selectionSort(list);
        for (double n : newList) {
            System.out.print(n + " ");
        }
    }
}
