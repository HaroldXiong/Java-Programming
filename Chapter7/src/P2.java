import java.util.Scanner;

/**
 * Created by xiong on 9/21/16.
 */
public class P2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        int[][] m = new int[4][4];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextInt();
            }
        }
        System.out.println("Sum of the element in the major diagonal is "
                + sumMajorDiagonal(m));
    }

    public static int sumMajorDiagonal(int[][] m) {
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i == j) {
                    sum += m[i][j];
                }
            }
        }
        return sum;
    }
}
