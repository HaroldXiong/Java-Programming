/**
 * Created by Xiong on 9/13/2016.
 */
public class P18 {
    public static void main(String[] args) {
        System.out.println("RealNumber\t\tSquareRoot");
        System.out.println("-------------------------------");

        for (int num = 0; num <= 20; num++) {
            System.out.printf("%-10d\t\t%.4f",num, Math.sqrt(num));
            System.out.println();
        }
    }
}
