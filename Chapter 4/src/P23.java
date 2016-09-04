/**
 * Created by Xiong on 9/4/2016.
 */
public class P23 {
    public static void main(String[] args) {
        double resultFromLeftToRight = 0;
        double resultFromRightToLeft = 0;
        for (int n = 1; n <= 50000; n++) {
            resultFromLeftToRight += 1.0 / n;
        }
        for (int n = 50000; n > 0; n--) {
            resultFromRightToLeft += 1.0 / n;
        }
        System.out.println(resultFromLeftToRight
                - resultFromRightToLeft);
    }
}
