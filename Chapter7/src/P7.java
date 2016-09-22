/**
 * Created by xiong on 9/22/16.
 */
public class P7 {
    public static void main(String[] args) {
        double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},
                {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2},
                {5.5, 4, -0.5}};
        double[][] result = findNearestPoint(points);
        System.out.println("The nearest points are: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print("(");
            for (int j = 0; j < result[0].length; j++) {
                if (j < result[0].length - 1) {
                    System.out.print(result[i][j] + ", ");
                } else {
                    System.out.print(result[i][j]);
                }
            }
            System.out.print(")");
            System.out.println();
        }
    }

    public static double[][] findNearestPoint(double[][] number) {
        double[][] result = new double[2][3];
        double nearestDistance = distance(number, 0, 1);
        for (int i = 0; i < number.length - 1; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (nearestDistance > distance(number, i, j)) {
                    for (int k = 0; k < number[0].length; k++) {
                        result[0][k] = number[i][k];
                        result[1][k] = number[j][k];
                    }
                }
            }
        }
        return result;
    }

    public static double distance(double[][] number,
                                  int rowNumber1, int rowNumber2) {
        return Math.sqrt(Math.pow((number[rowNumber1][0] - number[rowNumber2][0]), 2)
                + Math.pow((number[rowNumber1][1] - number[rowNumber2][1]), 2)
                + Math.pow((number[rowNumber1][2] - number[rowNumber2][2]), 2));
    }
}
