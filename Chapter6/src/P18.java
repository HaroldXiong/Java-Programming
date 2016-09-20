/**
 * Created by xiong on 9/20/16.
 */
public class P18 {
    public static double[] bubbleSort(double[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = i; j > 0; j--) {
                if (list[j - 1] > list[j]) {
                    double temp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = temp;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        double[] list = {6.0, 4.4, 1.9, 2.9, 3.4, 2.9, 3.5};
        double[] newList = bubbleSort(list);
        for (double n : newList) {
            System.out.print(n + " ");
        }
    }
}
