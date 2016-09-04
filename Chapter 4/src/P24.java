/**
 * Created by Xiong on 9/4/2016.
 */
public class P24 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 97; i += 2) {
            sum += (i / (i + 2.0));
        }
        System.out.println(sum);
    }
}
